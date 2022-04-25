package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.entity.Student;
import cn.luxun.smartschool.service.StudentService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms/studentController")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	/**
	 * 学生分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param name
	 * @return
	 */
	@GetMapping("/getStudentByOpr/{pageNo}/{pageSize}")
	public Result getStudentByPage(@PathVariable("pageNo") Integer pageNo, @PathVariable("pageSize") Integer pageSize, Student student) {
		return studentService.getStudentByPage(pageNo, pageSize, student);
	}

	/**
	 * 新增或更新学生信息
	 *
	 * @param student
	 * @return
	 */
	@PostMapping("/addOrUpdateStudent")
	public Result addOrUpdateStudent(@RequestBody Student student) {
		return studentService.addOrUpdateStudent(student);
	}

	/**
	 * 根据id删除学生
	 *
	 * @param ids
	 * @return
	 */
	@DeleteMapping("/delStudentById")
	public Result deleteStudentByIds(@RequestBody List<Integer> ids) {
		return studentService.deleteStudentByIds(ids);
	}

}
