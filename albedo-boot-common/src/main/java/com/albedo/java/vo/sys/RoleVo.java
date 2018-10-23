package com.albedo.java.vo.sys;

import com.albedo.java.util.PublicUtil;
import com.albedo.java.util.StringUtil;
import com.albedo.java.util.annotation.DictType;
import com.albedo.java.vo.base.DataEntityVo;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * A user.
 */
@Data
@ToString
public class RoleVo extends DataEntityVo<String> {

    /*** 数据范围(所有数据) */
    public static final Integer DATA_SCOPE_ALL = 1;
    // 数据范围（1：所有数据；2：所在机构及以下数据；3：所在机构数据；4：仅本人数据；5：按明细设置）
    /*** 数据范围(所在机构及以下数据) */
    public static final Integer DATA_SCOPE_ORG_AND_CHILD = 2;
    /*** 数据范围(所在机构数据) */
    public static final Integer DATA_SCOPE_ORG = 3;
    /*** 数据范围(仅本人数据) */
    public static final Integer DATA_SCOPE_SELF = 4;
    /*** 数据范围(按明细设置) */
    public static final Integer DATA_SCOPE_CUSTOM = 5;
    public static final String F_NAME = "name";
    private static final long serialVersionUID = 1L;
    private String name;
    /*** 工作流组用户组类型 */
    private String type;
    /*** 组织ID */
    private String orgId;

    private String orgName;

    /*** 是否系统数据  0 是 1否*/
    private Integer sysData;
    /*** 可查看的数据范围 */
    private Integer dataScope;

    /*** 数据权限 */
//    @DictType(name = "sys_role_Data_Author")
    private String dataAuthor;
    private List<String> dataAuthorList;

    /** 角色ID */
    private String numberCode;

    private Integer sort;
    private List<String> resourceIdList;
    private List<String> orgIdList;
    private List<String> channelNoList;

}
