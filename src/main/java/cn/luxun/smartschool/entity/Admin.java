package cn.luxun.smartschool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	private Integer id;

	private String name;

	private Character gender;

	private String password;

	private String email;

	private String telephone;

	private String portraitPath;
}
