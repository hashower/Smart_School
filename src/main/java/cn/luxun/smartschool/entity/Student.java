package cn.luxun.smartschool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private String sno;

	private String name;

	//default
	private char gender = '男';

	private String password;

	private String email;

	private String telephone;

	private String address;

	private String introducation;

	// 存储头像的项目路径
	private String portraitPath;

	// 班级名称
	private String clazzName;

}
