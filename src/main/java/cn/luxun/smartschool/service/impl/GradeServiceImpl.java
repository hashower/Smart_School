package cn.luxun.smartschool.service.impl;

import cn.luxun.smartschool.entity.Grade;
import cn.luxun.smartschool.mapper.GradeMapper;
import cn.luxun.smartschool.service.GradeService;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
	@Override
	public Result getGradesByPage(Integer pageNo, Integer pageSize, String gradeName) {

		// 构造分页构造器
		Page<Grade> pageParam = new Page<>(pageNo, pageSize);

		// 构造分页构造器
		LambdaQueryWrapper<Grade> queryWrapper = new LambdaQueryWrapper();

		// 添加过滤条件
		if (StringUtils.isNotEmpty(gradeName)) {
			queryWrapper.like(Grade::getName, gradeName);
		}

		// 添加排序条件
		queryWrapper.orderByDesc(Grade::getId);

		return Result.ok(this.page(pageParam, queryWrapper));

	}

	@Override
	public Result saveGradeByParams(Grade grade) {
		this.saveOrUpdate(grade);
		return Result.ok("添加年纪成功");
	}

	@Override
	public Result deleteGradeByIds(List<Integer> ids) {
		this.removeByIds(ids);
		return Result.ok("删除成功");
	}

}
