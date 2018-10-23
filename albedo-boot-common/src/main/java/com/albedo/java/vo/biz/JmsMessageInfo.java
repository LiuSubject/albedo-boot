package com.albedo.java.vo.biz;


import lombok.Data;

/**
 * MQ消息发送的消息对象
 * @author ZH
 *
 */
@Data
public class JmsMessageInfo<T>{

    /**
     * app端接收消息的固定地址
     */
	public static final String DESTINATION = "ua.xdapp.service.queue";
	/**消息类型*/
	private String messageType;/////  + '_RESPONSE'
	/**应答地址:监听队列*/
	private String destination;////
	/**发送消息时间*/
	private Long sendTime;////
	/**消息识别码*/
	private String uuidCode;
	/**消息对象*/
	private T data;
	/**返回码*/
	private String code;
	/**返回提示消息*/
	private String message;

}
