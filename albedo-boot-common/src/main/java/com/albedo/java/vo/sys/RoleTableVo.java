package com.albedo.java.vo.sys;

import com.google.common.collect.Lists;
import com.albedo.java.util.PublicUtil;
import com.albedo.java.util.StringUtil;
import com.albedo.java.util.annotation.DictType;
import com.albedo.java.util.base.Collections3;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * 描述: 角色分页查询返回前端的vo
 *
 * @auther: ZhengChao
 * @date: 2018/10/18 14:26
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RoleTableVo  implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    @DictType(name="sys_user_account_status")
    private String status;
    private Date lastModifiedDate;
    private Date createdDate;
    /** 角色ID */
    private String numberCode;
    /*** 数据权限 */
    private String dataAuthor;
    private List<String> resourceIdList;
    private List<String> dataAuthorList;
    private List<String> channelNoList;
    /**
     * 是否可删除
     */
    private Boolean canDelete;

    /*public void setDataAuthorList(){
        this.resourceIdList = Lists.newArrayList(dataAuthor.split(StringUtil.SPLIT_DEFAULT));
    }*/

    public List<String> getDataAuthor(){
        if (PublicUtil.isEmpty(dataAuthorList) && PublicUtil.isNotEmpty(dataAuthor)) {
            dataAuthorList = Lists.newArrayList(dataAuthor.split(StringUtil.SPLIT_DEFAULT));
        }
        return dataAuthorList;
    }
}
