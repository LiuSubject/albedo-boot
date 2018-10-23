package com.albedo.java.vo.sys;

import com.albedo.java.util.annotation.DictType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * A user.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserTableVo implements Serializable {


    private static final long serialVersionUID = 1L;
    private String id;
    private String orgName;
    private String orgParentName;
    private String loginId;
    private String name;
    private String phone;
    private String email;
    private String roleNames;
    @DictType(name="sys_user_account_status")
    private String status;
    private String idCard;
    private String city;
    /** 用户ID */
    private String numberCode;
    private Date lastModifiedDate;
    private Date createdDate;
    private String areaNames;
}
