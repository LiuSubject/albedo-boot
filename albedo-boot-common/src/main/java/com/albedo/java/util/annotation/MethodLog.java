package com.albedo.java.util.annotation;

/**
 * @author ZhengChao
 * @Title: MethodLog
 * @ProjectName UALoan
 * @Description: TODO 是否添操作日志注解
 * @date 2018/9/18
 */

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodLog {

    /**
     * 记录操作描述
     *
     * @return
     */
    String remark() default "";

    /**
     * 发送或者接收 SEND_RECEIVE
     *
     * @return
     */
    String openType() default "RECEIVE";
}
