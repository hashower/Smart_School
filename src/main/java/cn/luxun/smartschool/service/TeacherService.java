package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Teacher;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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

	/**
	 * 获取教师分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param teacher
	 * @return
	 */
	Result getTeacherByPage(Integer pageNo, Integer pageSize, Teacher teacher);

	/**
	 * 新增和更新教师信息
	 *
	 * @param teacher
	 * @return
	 */
	Result saveOrUpdateTeacher(Teacher teacher);

	/**
	 * 根据id删除教师
	 *
	 * @param ids
	 * @return
	 */
	Result deleteTeacherByIds(List<Integer> ids);
}
