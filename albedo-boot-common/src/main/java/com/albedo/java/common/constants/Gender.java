package com.albedo.java.common.constants;

/**
 * 性别
 * @Auther: ZhengChao
 * @Date: 2018/9/6 13:30
 */
public enum Gender {

    MALE("男"),
    FEMALE("女");
    private String text;

    Gender(String text){
        this.text=text;
    }

    public static Gender get(String str) {
        for (Gender e : values()) {
            if(e.getText().equals(str)) {
                return e;
            }
        }
        return null;
    }

    public String getText() {
        return text;
    }
}
