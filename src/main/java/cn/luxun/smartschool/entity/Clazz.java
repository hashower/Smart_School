package cn.luxun.smartschool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Clazz {


	// 班级Id
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	// 班级名称
	private String name;

	// 班级人数
	private String number;

	// 班级介绍
	private String introducation;

	// 班主任姓名
	private String headmaster;

	// 班主任电话
	private String telephone;

	//班 主任邮箱
	private String email;

	// 所属年级
	private String gradeName;


}
