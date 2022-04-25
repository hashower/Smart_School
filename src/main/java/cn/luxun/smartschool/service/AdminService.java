package cn.luxun.smartschool.service;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface AdminService extends IService<Admin> {
	Admin login(LoginDto loginForm);

	Admin getAdminById(Long userId);

	/**
	 * 获取管理员分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param admin
	 * @return
	 */
	Result getAllAdminByPage(Integer pageNo, Integer pageSize, String adminName);

	/**
	 * 新增和修改管理员信息
	 *
	 * @param admin
	 * @return
	 */
	Result saveOrUpdateAdmin(Admin admin);

	/**
	 * 根据id删除管理员
	 *
	 * @param ids
	 * @return
	 */
	Result deleteAdminByIds(List<Integer> ids);
}
