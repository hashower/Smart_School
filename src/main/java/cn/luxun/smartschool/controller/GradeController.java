package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.entity.Grade;
import cn.luxun.smartschool.service.GradeService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms/gradeController")
public class GradeController {

	private final GradeService gradeService;

	public GradeController(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	/**
	 * 根据分页获取班级
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param gradeName
	 * @return
	 */
	@GetMapping("/getGrades/{pageNo}/{pageSize}")
	public Result getGradesByPage(@PathVariable("pageNo") Integer pageNo,
	                              @PathVariable("pageSize") Integer pageSize,
	                              String gradeName) {
		return gradeService.getGradesByPage(pageNo, pageSize, gradeName);
	}

	/**
	 * 添加或更改年级
	 *
	 * @param grade
	 * @return
	 */
	@PostMapping("/saveOrUpdateGrade")
	public Result saveGradeByParams(@RequestBody Grade grade) {
		return gradeService.saveGradeByParams(grade);
	}

	/**
	 * 根据id删除年纪
	 *
	 * @param ids
	 * @return
	 */
	@DeleteMapping("/deleteGrade")
	public Result deleteGradeByIds(@RequestBody List<Integer> ids) {
		System.out.println(ids);
		return gradeService.deleteGradeByIds(ids);
	}
}
