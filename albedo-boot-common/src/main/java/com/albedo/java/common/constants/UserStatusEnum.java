package com.albedo.java.common.constants;

/**
 * @Auther: ZhengChao
 * @Date: 2018/9/6 14:20
 */
public enum UserStatusEnum {
    FLAG_DELETE(-1,"删除"),
    FLAG_UNABLE(0,"禁用"),
    FLAG_NORMAL(1,"正常"),
    FLAG_WITHDRAW(2,"注销");

    private String text;
    private int status;

    UserStatusEnum(int status , String text){
        this.status=status;
        this.text=text;
    }

    public static UserStatusEnum get(int status) {
        for (UserStatusEnum e : values()) {
            if(e.status==status) {
                return e;
            }
        }
        return null;
    }

    public String getText() {
        return text;
    }
}
