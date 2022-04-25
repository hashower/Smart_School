package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.mapper.AdminMapper;
import cn.luxun.smartschool.service.AdminService;
import cn.luxun.smartschool.utils.MD5;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

	@Override
	public Admin login(LoginDto loginForm) {

		// 构建条件构造器
		LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();

		// 添加条件
		queryWrapper.eq(Admin::getName, loginForm.getUsername());
		queryWrapper.eq(Admin::getPassword, MD5.encrypt(loginForm.getPassword()));
		Admin admin = this.getBaseMapper().selectOne(queryWrapper);
		return admin;
	}

	@Override
	public Admin getAdminById(Long userId) {
		LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(Admin::getId, userId);
		System.out.println(this.baseMapper.selectOne(queryWrapper));
		return this.baseMapper.selectOne(queryWrapper);
	}

}
