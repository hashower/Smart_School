package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Student;
import cn.luxun.smartschool.mapper.StudentMapper;
import cn.luxun.smartschool.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
