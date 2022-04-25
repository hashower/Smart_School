package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Student;
import cn.luxun.smartschool.mapper.StudentMapper;
import cn.luxun.smartschool.service.StudentService;
import cn.luxun.smartschool.utils.MD5;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

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

	@Override
	public Result getStudentByPage(Integer pageNo, Integer pageSize, Student student) {

		// 构造分页构造器
		Page<Student> pageInfo = new Page<>(pageNo, pageSize);


		// 条件构造器
		LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();

		queryWrapper.like(student.getName() != null, Student::getName, student.getName());
		queryWrapper.like(student.getClazzName() != null, Student::getClazzName, student.getClazzName());
		queryWrapper.orderByDesc(Student::getId);

		Page<Student> page = this.page(pageInfo, queryWrapper);
		return Result.ok(page);
	}

	@Override
	public Result addOrUpdateStudent(Student student) {
		this.saveOrUpdate(student);
		return Result.ok("新增学生信息成功");
	}

	@Override
	public Result deleteStudentByIds(List<Integer> ids) {
		this.removeByIds(ids);
		return Result.ok("删除学生信息成功");
	}

}
