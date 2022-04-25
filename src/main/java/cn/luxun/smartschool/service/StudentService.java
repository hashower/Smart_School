package cn.luxun.smartschool.service;

import cn.luxun.smartschool.dto.LoginDto;
import cn.luxun.smartschool.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

public interface StudentService extends IService<Student> {
	Student login(LoginDto loginForm);

	Student getStudentById(Long userId);
}
