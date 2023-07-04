package com.ruoyi.core.mapper;

import com.ruoyi.core.entity.Custom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.core.entity.vo.CustomListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 张玉
* @description 针对表【t_custom(顾客信息表)】的数据库操作Mapper
* @createDate 2023-07-04 10:28:46
* @Entity com.ruoyi.core.entity.Custom
*/
@Mapper
public interface CustomMapper extends BaseMapper<Custom> {

    List<CustomListVO> getCustomList(CustomListVO customListVO);
}




