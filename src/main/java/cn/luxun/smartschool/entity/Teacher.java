package cn.luxun.smartschool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class Teacher {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String tno;

    private String name;

    private char gender;

    private String password;

    private String email;

    private String telephone;

    private String address;

    private String clazzName;

    //存储头像的项目路径
    private String portraitPath;

//    @TableLogic
//    private Integer isDeleted;
}
