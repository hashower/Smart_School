package cn.luxun.smartschool.service;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.dto.LoginDto;
import com.baomidou.mybatisplus.extension.service.IService;

public interface AdminService extends IService<Admin> {
	Admin login(LoginDto loginForm);

	Admin getAdminById(Long userId);
}
