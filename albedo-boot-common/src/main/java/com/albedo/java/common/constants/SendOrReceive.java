package com.albedo.java.common.constants;

/**
 * 发送或接收
 * @Auther: ZhengChao
 * @Date: 2018/9/6 14:26
 */
public enum SendOrReceive {

    SEND("发送"),
    RECEIVE("接收");

    private String text;

    SendOrReceive(String text){
        this.text=text;
    }

    public static SendOrReceive get(String str) {
        for (SendOrReceive e : values()) {
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
