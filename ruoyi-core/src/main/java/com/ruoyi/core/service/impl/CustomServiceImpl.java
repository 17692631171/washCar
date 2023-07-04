package com.ruoyi.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.core.entity.Custom;
import com.ruoyi.core.entity.vo.CustomListVO;
import com.ruoyi.core.service.CustomService;
import com.ruoyi.core.mapper.CustomMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author 张玉
* @description 针对表【t_custom(顾客信息表)】的数据库操作Service实现
* @createDate 2023-07-04 10:28:46
*/
@Service
public class CustomServiceImpl extends ServiceImpl<CustomMapper, Custom>
    implements CustomService{

    private final CustomMapper customMapper;

    public CustomServiceImpl(CustomMapper customMapper){
        this.customMapper = customMapper;
    }
    /**
     * 获取顾客信息列表
     *
     * @param customListVO 请求参数
     * @return 顾客信息列表
     */
    @Override
    public List<CustomListVO> getCustomList(CustomListVO customListVO) {
        List<CustomListVO> result = customMapper.getCustomList(customListVO);
        return result;
    }
}




