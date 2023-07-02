<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch">
      <el-form-item label="姓名：" prop="realNameSearch">
        <el-input v-model="queryParams.realNameSearch" placeholder="请输入姓名" clearable />
      </el-form-item>
      <el-form-item label="性别：" prop="sexSearch">
        <el-select v-model="queryParams.sexSearch" filterable placeholder="请选择" clearable>
          <el-option v-for="dict in dict.type.custom_sex" :key="dict.value" :label="dict.label" :value="dict.value" />
        </el-select>
      </el-form-item>
      <el-form-item label="车牌号：" prop="carNumberSearch">
        <el-input v-model="queryParams.carNumberSearch" placeholder="请输入车牌号" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="手机号：" prop="phoneSearch">
        <el-input v-model="queryParams.phoneSearch" placeholder="请输入手机号" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="状态：" prop="statusSearch">
        <el-select v-model="queryParams.status" filterable placeholder="请选择" clearable>
          <el-option v-for="dict in dict.type.custom_status" :key="dict.value" :label="dict.label" :value="dict.value">
          </el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="上次消费时间：" prop="lastConsumptionDate">
        <el-date-picker v-model="queryParams.lastConsumptionDateSearch" type="daterange" start-placeholder="开始日期"
          end-placeholder="结束日期" :default-time="['00:00:00', '23:59:59']" :picker-options="pickerOptions">
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="small" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh-right" size="small">重置</el-button>
      </el-form-item>
    </el-form>
    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button type="primary" plain icon="el-icon-plus" size="mini" @click="handleAdd"
          v-hasPermi="['system:role:add']">新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:role:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:role:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:role:export']">导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table :data="customList" border style="width: 100%" v-loading="loading">
      <el-table-column type="selection" width="50" align="center" />
      <el-table-column fixed align="center" key="realName" prop="realName" label="姓名" width="70" />
      <el-table-column align="center" width="120" prop="sex" label="性别">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.custom_sex" :value="scope.row.sex" />
        </template>
      </el-table-column>
      <el-table-column align="center" key="weChatNumber" prop="weChatNumber" label="微信号" width="120" />
      <el-table-column align="center" key="carNumber" prop="carNumber" label="车牌号" width="120" />
      <el-table-column align="center" key="phone" prop="phone" label="手机号" width="120" />
      <el-table-column align="center" key="address" prop="address" label="地址" width="300" />
      <el-table-column align="center" key="status" prop="status" label="状态" width="120">
        <template slot-scope="scope">
          <el-tag :color="scope.row.status == '0' ? 'rgb(120, 184, 242)' :
            scope.row.status == '1' ? 'rgb(113, 226, 163)' :
              scope.row.status == '2' ? 'yellow' : '2'">
            <dict-tag :options="dict.type.custom_status" effect="dark" :value="scope.row.status" style="color: white;" />
          </el-tag>
        </template>
      </el-table-column>
      <el-table-column align="center" key="consumptionTotal" prop="consumptionTotal" label="累计消费" width="120" />
      <el-table-column align="center" key="lastConsumptionDate" prop="lastConsumptionDate" label="上次消费时间" width="120">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.lastConsumptionDate) }}</span>
        </template>
      </el-table-column>
      <el-table-column fixed="right" label="操作" width="100">
        <template slot-scope="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
          <el-button type="text" size="small">编辑</el-button>
        </template>
      </el-table-column>
      <el-table-column align="center" key="remarks" fixed="right" prop="remarks" label="备注" width="150">
      </el-table-column>
    </el-table>
    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />
  </div>
</template>

<script>
import { getCustomList } from '@/api/core/custom/custom';

export default {
  dicts: ['custom_sex', 'custom_status'],
  data() {
    return {
      //加载动画
      loading: false,
      //顾客列表信息
      customList: [],
      showSearch: true,
      //顾客列表数量
      total: 0,
      //顾客列表页数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        realNameSearch: undefined,
        sexSearch: undefined,
        carNumberSearch: undefined,
        phone: undefined,
        statuSearch: undefined,
        lastConsumptionDateSearch: undefined
      },
      sex: '',
      pickerOptions: {
        shortcuts: [{
          text: '最近一周',
          onClick(picker) {
            const end = new Date();
            const start = new Date();
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
            picker.$emit('pick', [start, end]);
          }
        }, {
          text: '最近一个月',
          onClick(picker) {
            const end = new Date();
            const start = new Date();
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
            picker.$emit('pick', [start, end]);
          }
        }, {
          text: '最近三个月',
          onClick(picker) {
            const end = new Date();
            const start = new Date();
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
            picker.$emit('pick', [start, end]);
          }
        }]
      }
    }
  },
  methods: {
    handleClick(row) {
      console.log(row)
    },
    //获取顾客列表信息
    getList() {
      //this.loading = true;
      getCustomList(this.addDateRange(this.queryParams, this.dateRange)).then(response => {
        console.log(response);
        this.customList = response.rows;
        this.total = response.total;
        this.loading = false;
      }
      )
    },
    // 顾客状态修改
    handleStatusChange(row) {
      let text = row.status === "0" ? "启用" : "停用";
      this.$modal.confirm('确认要' + text + '"' + row.realName + '"用户吗？').then(function () {
        return changeUserStatus(row.userId, row.status);
      }).then(() => {
        this.$modal.msgSuccess(text + "成功");
      }).catch(function () {
        row.status = row.status === "0" ? "1" : "0";
      });
    },
    //动态显示顾客状态样式
    switchTagType(rows) {

    },
    //搜索按钮
    handleQuery(){
      this.queryParams.pageNum = 1;
      this.getList();
    }
  },

  created() {
    this.getList()
  }
}
</script>
