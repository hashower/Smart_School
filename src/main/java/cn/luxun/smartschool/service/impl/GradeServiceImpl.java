package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.mapper.AdminMapper;
import cn.luxun.smartschool.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
