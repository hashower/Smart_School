package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
