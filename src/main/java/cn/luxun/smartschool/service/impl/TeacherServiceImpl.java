package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Teacher;
import cn.luxun.smartschool.mapper.TeacherMapper;
import cn.luxun.smartschool.service.TeacherService;
import cn.luxun.smartschool.utils.MD5;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

	@Override
	public Teacher login(LoginDto loginForm) {

		// 构建条件构造器
		LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();

		// 添加条件
		queryWrapper.eq(Teacher::getName, loginForm.getUsername());
		queryWrapper.eq(Teacher::getPassword, MD5.encrypt(loginForm.getPassword()));
		Teacher teacher = this.getOne(queryWrapper);
		return teacher;
	}

	@Override
	public Teacher getTeacherById(Long userId) {

		LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(Teacher::getId, userId);
		return this.getOne(queryWrapper);
	}
}
