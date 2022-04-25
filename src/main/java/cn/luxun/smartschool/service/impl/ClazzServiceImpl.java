package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Clazz;
import cn.luxun.smartschool.mapper.ClazzMapper;
import cn.luxun.smartschool.service.ClazzService;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {

	@Override
	public Result getClazzByPage(Integer pageNo, Integer pageSize, Clazz clazz) {

		// 构造分页构造器
		Page<Clazz> pageInfo = new Page<>(pageNo, pageSize);


		// 条件构造器
		LambdaQueryWrapper<Clazz> queryWrapper = new LambdaQueryWrapper<>();

		queryWrapper.like(clazz.getGradeName() != null, Clazz::getGradeName, clazz.getGradeName());
		queryWrapper.like(clazz.getName() != null, Clazz::getName, clazz.getName());

		queryWrapper.orderByDesc(Clazz::getId);

		Page<Clazz> page = this.page(pageInfo, queryWrapper);
		return Result.ok(page);

	}

	@Override
	public Result saveClazzByParams(Clazz clazz) {
		this.saveOrUpdate(clazz);
		return Result.ok("新增班级成功");
	}

	@Override
	public Result deleteClazzByIds(List<Integer> ids) {
		this.removeByIds(ids);
		return Result.fail().message("删除成功");
	}

	@Override
	public Result getAllClazz() {
		List<Clazz> list = this.list(new LambdaQueryWrapper<>());
		return Result.ok(list);
	}
}
