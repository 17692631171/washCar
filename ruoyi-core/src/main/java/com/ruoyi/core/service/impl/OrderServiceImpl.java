package com.ruoyi.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.core.entity.Order;
import com.ruoyi.core.service.OrderService;
import com.ruoyi.core.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 张玉
* @description 针对表【t_order(订单表)】的数据库操作Service实现
* @createDate 2023-07-04 10:28:47
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




