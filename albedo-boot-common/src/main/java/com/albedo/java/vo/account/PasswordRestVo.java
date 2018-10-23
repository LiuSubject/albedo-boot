package com.albedo.java.vo.account;


import com.albedo.java.vo.sys.UserVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * View Model object for storing a user's credentials.
 */
@Data
@ToString
public class PasswordRestVo {

    @NotBlank
    @ApiModelProperty("登录ID")
    private String loginId;
    @NotBlank
    @ApiModelProperty("姓名")
    private String name;
    @NotBlank
    @ApiModelProperty("手机")
    private String phone;
    @NotBlank
    @ApiModelProperty("验证码")
    private String code;
    @NotBlank
    @Size(min = 6, max = UserVo.PASSWORD_MAX_LENGTH)
    @ApiModelProperty("新密码")
    private String newPassword;
    @ApiModelProperty(hidden = true)
    String passwordPlaintext;
    @NotBlank
    @Size(min = 6, max = UserVo.PASSWORD_MAX_LENGTH)
    private String confirmPassword;

}
