package cn.luxun.smartschool.service;

import cn.luxun.smartschool.entity.Grade;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface GradeService extends IService<Grade> {

	/**
	 * 根据分页获取班级
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param gradeName
	 * @return
	 */
	Result getGradesByPage(Integer pageNo, Integer pageSize, String gradeName);

	/**
	 * 添加或更改年级
	 *
	 * @param grade
	 * @return
	 */
	Result saveGradeByParams(Grade grade);

	/**
	 * 根据id删除年纪
	 *
	 * @param ids
	 * @return
	 */
	Result deleteGradeByIds(List<Integer> ids);

	/**
	 * 获得所有班级
	 *
	 * @return
	 */
	Result getAllGrades();
}
