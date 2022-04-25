package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TeacherService extends IService<Teacher> {
	Teacher login(LoginDto loginForm);

	Teacher getTeacherById(Long userId);
}
