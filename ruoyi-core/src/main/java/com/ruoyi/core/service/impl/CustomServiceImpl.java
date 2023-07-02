package com.ruoyi.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.core.entity.Custom;
import com.ruoyi.core.entity.vo.CustomListVO;
import com.ruoyi.core.mapper.CarMapper;
import com.ruoyi.core.service.CustomService;
import com.ruoyi.core.mapper.CustomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_custom(顾客基础表)】的数据库操作Service实现
* @createDate 2023-07-01 17:19:09
*/
@Service
public class CustomServiceImpl extends ServiceImpl<CustomMapper, Custom>
    implements CustomService{
    private final CustomMapper customMapper;
    private final CarMapper carMapper;
    public CustomServiceImpl(CustomMapper customMapper,CarMapper carMapper){
        this.customMapper = customMapper;
        this.carMapper = carMapper;
    }


    @Override
    public List<CustomListVO> getCustomList() {
        List<CustomListVO> customList = customMapper.getCustomList();
        return customList;
    }
}




