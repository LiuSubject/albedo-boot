package com.albedo.java.vo.sys;

import com.albedo.java.vo.base.DataEntityVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * A user.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDataVo extends DataEntityVo<String> {

    public static final int PASSWORD_MIN_LENGTH = 6;

    public static final int PASSWORD_MAX_LENGTH = 64;

    /*** F_LOGINID */
    public static final String F_LOGINID = "loginId";
    /*** F_LOGINID */
    public static final String F_EMAIL = "email";
    public static final String F_PHONE = "phone";
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("头像")
    private String avatar;
    @ApiModelProperty("登录ID")
    private String loginId;
    @ApiModelProperty("所属部门")
    private String orgId;
    private String name;
    private String phone;
    private String email;
    private String roleIdList;
    private String roleNames;
    private String orgName;
    private String idCard;
    private String city;
    /** 用户ID */
    private String numberCode;
    @ApiModelProperty("登录时间")
    private Date loginTime;
    @ApiModelProperty("系统当前时间")
    private Date currentTime;
    @ApiModelProperty("权限")
    private List<String> authorities;

//    public String getRoleIds() {
//        return Collections3.convertToString(getRoleIdList(), StringUtil.SPLIT_DEFAULT);
//    }

}
