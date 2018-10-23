package com.albedo.java.vo.sys;

import com.albedo.java.util.PublicUtil;
import com.albedo.java.util.base.Assert;
import com.albedo.java.util.base.Collections3;
import com.albedo.java.vo.base.DataEntityVo;
import com.albedo.java.vo.base.GeneralEntityVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A user.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRestVo extends GeneralEntityVo<String> {

    private String name;
    private String phone;


    public UserRestVo(UserVo userVo){
        Assert.assertIsTrue(userVo!=null && PublicUtil.isNotEmpty(userVo.getId()),
            "无法获取用户信息");
        this.name=userVo.getName();
        this.phone=userVo.getPhone();
    }
}
