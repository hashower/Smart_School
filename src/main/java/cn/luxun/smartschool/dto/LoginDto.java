package cn.luxun.smartschool.dto;

import lombok.Data;

@Data
public class LoginDto {

    private String username;

    private String password;

    private String verifiCode;

    private Integer userType;

}
