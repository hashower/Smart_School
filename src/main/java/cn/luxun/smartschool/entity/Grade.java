package cn.luxun.smartschool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class Grade {

	// 年级ID
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	// 年级名称
	private String name;

	// 年级介绍
	private String introducation;

	//年 级主任姓名
	private String manager;

	// 年级主任邮箱
	private String email;

	// 年级主任电话
	private String telephone;

}