package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Grade;
import cn.luxun.smartschool.mapper.GradeMapper;
import cn.luxun.smartschool.service.GradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
}
