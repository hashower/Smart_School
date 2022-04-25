package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Student;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface StudentService extends IService<Student> {

	/**
	 * 学生登录
	 *
	 * @param loginForm
	 * @return
	 */
	Student login(LoginDto loginForm);

	/**
	 * 根据id获得学生信息
	 *
	 * @param userId
	 * @return
	 */
	Student getStudentById(Long userId);

	/**
	 * 学生分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param name
	 * @return
	 */
	Result getStudentByPage(Integer pageNo, Integer pageSize, Student student);

	/**
	 * 新增或更新学生信息
	 *
	 * @param student
	 * @return
	 */
	Result addOrUpdateStudent(Student student);

	/**
	 * 根据id删除学生
	 *
	 * @param ids
	 * @return
	 */
	Result deleteStudentByIds(List<Integer> ids);
}
