package cn.luxun.smartschool.controller;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.service.AdminService;
import cn.luxun.smartschool.utils.Result;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms/adminController")
public class AdminController {

	private final AdminService adminService;

	public AdminController(AdminService adminService) {
		this.adminService = adminService;
	}

	/**
	 * 获取管理员分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param admin
	 * @return
	 */
	@GetMapping("/getAllAdmin/{pageNo}/{pageSize}")
	public Result getAllAdminByPage(@PathVariable("pageNo") Integer pageNo, @PathVariable("pageSize") Integer pageSize, String adminName) {
		return adminService.getAllAdminByPage(pageNo, pageSize, adminName);
	}

	/**
	 * 新增和修改管理员信息
	 *
	 * @param admin
	 * @return
	 */
	@PostMapping("/saveOrUpdateAdmin")
	public Result saveOrUpdateAdmin(@RequestBody Admin admin) {
		return adminService.saveOrUpdateAdmin(admin);
	}

	/**
	 * 根据id删除管理员
	 *
	 * @param ids
	 * @return
	 */
	@DeleteMapping("/deleteAdmin")
	public Result deleteAdminByIds(@RequestBody List<Integer> ids) {
		return adminService.deleteAdminByIds(ids);
	}
}
