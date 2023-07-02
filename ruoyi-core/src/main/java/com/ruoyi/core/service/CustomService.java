package com.ruoyi.core.service;

import com.ruoyi.core.entity.Custom;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.core.entity.vo.CustomListVO;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_custom(顾客基础表)】的数据库操作Service
* @createDate 2023-07-01 17:19:09
*/
public interface CustomService extends IService<Custom> {

    List<CustomListVO> getCustomList();
}
