package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Teacher;
import cn.luxun.smartschool.mapper.TeacherMapper;
import cn.luxun.smartschool.service.TeacherService;
import cn.luxun.smartschool.utils.MD5;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

	/**
	 * 获取教师分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param teacher
	 * @return
	 */
	@Override
	public Result getTeacherByPage(Integer pageNo, Integer pageSize, Teacher teacher) {
		Page<Teacher> pageInfo = new Page<>(pageNo, pageSize);

		LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.like(teacher.getName() != null, Teacher::getName, teacher.getName());
		queryWrapper.like(teacher.getClazzName() != null, Teacher::getClazzName, teacher.getClazzName());

		queryWrapper.orderByDesc(Teacher::getId);

		Page<Teacher> page = this.page(pageInfo, queryWrapper);

		return Result.ok(page);
	}

	@Override
	public Result saveOrUpdateTeacher(Teacher teacher) {
		this.saveOrUpdate(teacher);
		return Result.ok("新增教师信息成功");
	}

	@Override
	public Result deleteTeacherByIds(List<Integer> ids) {
		this.removeByIds(ids);
		return Result.ok("删除教师信息成功");
	}
}
