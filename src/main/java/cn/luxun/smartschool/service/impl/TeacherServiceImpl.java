package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Teacher;
import cn.luxun.smartschool.mapper.TeacherMapper;
import cn.luxun.smartschool.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
