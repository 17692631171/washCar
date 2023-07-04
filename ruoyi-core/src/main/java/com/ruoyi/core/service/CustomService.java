package com.ruoyi.core.service;

import com.ruoyi.core.entity.Custom;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.core.entity.vo.CustomListVO;

import java.util.List;
import java.util.Map;

/**
* @author 张玉
* @description 针对表【t_custom(顾客信息表)】的数据库操作Service
* @createDate 2023-07-04 10:28:46
*/
public interface CustomService extends IService<Custom> {
    /**
     * 获取顾客信息列表
     *
     * @param customListVO 请求参数
     * @return 顾客信息列表
     */
    List<CustomListVO> getCustomList(CustomListVO customListVO);
}
