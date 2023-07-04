package com.ruoyi.core.mapper;

import com.ruoyi.core.entity.Custom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
* @author 张玉
* @description 针对表【t_custom(顾客信息表)】的数据库操作Mapper
* @createDate 2023-07-04 10:28:46
* @Entity com.ruoyi.core.entity.Custom
*/
@Mapper
public interface CustomMapper extends BaseMapper<Custom> {

    void getCustomList(Map map);
}




