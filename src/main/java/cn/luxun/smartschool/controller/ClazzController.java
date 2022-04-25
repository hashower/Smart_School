package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.entity.Clazz;
import cn.luxun.smartschool.service.ClazzService;
import cn.luxun.smartschool.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms/clazzController")
public class ClazzController {

	private final ClazzService clazzService;

	public ClazzController(ClazzService clazzService) {
		this.clazzService = clazzService;
	}

	/**
	 * 获取所有班级
	 *
	 * @return
	 */
	@GetMapping("/getClazzs")
	public Result getAllClazz() {
		return clazzService.getAllClazz();
	}

	/**
	 * 班级分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param gradeName
	 * @return
	 */
	@GetMapping("/getClazzsByOpr/{pageNo}/{pageSize}")
	public Result getClazzByPage(@PathVariable("pageNo") Integer pageNo, @PathVariable("pageSize") Integer pageSize, Clazz clazz) {
		return clazzService.getClazzByPage(pageNo, pageSize, clazz);
	}

	/**
	 * 新增和修改班级信息
	 *
	 * @param clazz
	 * @return
	 */
	@PostMapping("/saveOrUpdateClazz")
	public Result saveClazzByParams(@RequestBody Clazz clazz) {
		return clazzService.saveClazzByParams(clazz);

	}

	/**
	 * 根据id删除班级
	 *
	 * @param ids
	 * @return
	 */
	@DeleteMapping("/deleteClazz")
	public Result deleteClazzByIds(@RequestBody List<Integer> ids) {
		return clazzService.deleteClazzByIds(ids);
	}
}
