package com.ruoyi.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.core.entity.Car;
import com.ruoyi.core.service.CarService;
import com.ruoyi.core.mapper.CarMapper;
import org.springframework.stereotype.Service;

/**
* @author 张玉
* @description 针对表【t_car(车辆信息表)】的数据库操作Service实现
* @createDate 2023-07-04 10:28:46
*/
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car>
    implements CarService{

}




