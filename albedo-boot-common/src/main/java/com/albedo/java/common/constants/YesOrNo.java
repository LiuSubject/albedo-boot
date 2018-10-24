package com.albedo.java.common.constants;

/**
 * @author ZhengChao
 * @Title: YesOrNo
 * @ProjectName UALoan
 * @Description: TODO
 * @date 2018/9/10
 */
public enum YesOrNo {

    YES("1"),
    NO("0");

    private String text;

    YesOrNo (String text){
        this.text = text;
    }

    public static YesOrNo get(String str) {
        for (YesOrNo e : values()) {
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
