package cn.luxun.smartschool.service;

import cn.luxun.smartschool.entity.Admin;
import cn.luxun.smartschool.entity.Clazz;
import cn.luxun.smartschool.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ClazzService extends IService<Clazz> {

	/**
	 * 班级分页
	 *
	 * @param pageNo
	 * @param pageSize
	 * @param gradeName
	 * @return
	 */
	Result getClazzByPage(Integer pageNo, Integer pageSize, Clazz clazz);

	/**
	 * 新增和修改班级信息
	 *
	 * @param clazz
	 * @return
	 */
	Result saveClazzByParams(Clazz clazz);

	/**
	 * 根据id删除班级
	 *
	 * @param ids
	 * @return
	 */
	Result deleteClazzByIds(List<Integer> ids);
}
