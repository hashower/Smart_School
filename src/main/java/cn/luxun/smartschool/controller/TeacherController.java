package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.entity.Teacher;
import cn.luxun.smartschool.service.TeacherService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms/teacherController")
public class TeacherController {

	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	/**
	 * 获取教师分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param teacher
	 * @return
	 */
	@GetMapping("/getTeachers/{pageNo}/{pageSize}")
	public Result getTeacherByPage(@PathVariable("pageNo") Integer pageNo, @PathVariable("pageSize") Integer pageSize, Teacher teacher) {
		return teacherService.getTeacherByPage(pageNo, pageSize, teacher);
	}

	/**
	 * 新增和更新教师信息
	 *
	 * @param teacher
	 * @return
	 */
	@PostMapping("/saveOrUpdateTeacher")
	public Result saveOrUpdateTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveOrUpdateTeacher(teacher);
	}

	/**
	 * 根据id删除教师
	 *
	 * @param ids
	 * @return
	 */
	@DeleteMapping("/deleteTeacher")
	public Result deleteTeacherByIds(@RequestBody List<Integer> ids) {
		return teacherService.deleteTeacherByIds(ids);
	}
}
