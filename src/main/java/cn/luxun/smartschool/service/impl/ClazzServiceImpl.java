package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Clazz;
import cn.luxun.smartschool.mapper.ClazzMapper;
import cn.luxun.smartschool.service.ClazzService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {
}
