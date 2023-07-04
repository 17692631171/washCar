package com.ruoyi.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.core.entity.Member;
import com.ruoyi.core.service.MemberService;
import com.ruoyi.core.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author 张玉
* @description 针对表【t_member(会员信息表)】的数据库操作Service实现
* @createDate 2023-07-04 10:28:46
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




