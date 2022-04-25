package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TeacherService extends IService<Teacher> {

	/**
	 * 教师登录
	 *
	 * @param loginForm
	 * @return
	 */
	Teacher login(LoginDto loginForm);

	/**
	 * 根据id获得教师信息
	 *
	 * @param userId
	 * @return
	 */
	Teacher getTeacherById(Long userId);
}
