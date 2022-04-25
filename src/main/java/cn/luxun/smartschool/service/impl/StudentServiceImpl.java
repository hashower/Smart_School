package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Student;
import cn.luxun.smartschool.mapper.StudentMapper;
import cn.luxun.smartschool.service.StudentService;
import cn.luxun.smartschool.utils.MD5;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

	@Override
	public Student login(LoginDto loginForm) {

		// 构建条件构造器
		LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();

		// 添加条件
		queryWrapper.eq(Student::getName, loginForm.getUsername());
		queryWrapper.eq(Student::getPassword, MD5.encrypt(loginForm.getPassword()));
		Student Student = this.getOne(queryWrapper);
		return Student;
	}

	@Override
	public Student getStudentById(Long userId) {

		LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(Student::getId, userId);
		return this.getOne(queryWrapper);
	}
}
