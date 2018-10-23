package com.albedo.java.vo.biz;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 渠道贷款状态变更
 */
@Data
public class ChannelStatusModifyVo {

    private String serialNo;

    /**
     * 放款日期
     */
    private Date loanedDate;

    /**
     * 放款金额
     */
    private BigDecimal loanedAmount;

    /**
     * 结算方式
     */
    private String settlementMethod;

    /**
     * 结算类型
     */
    private String settlementType;

    /**
     * 结算金额
     */
    private BigDecimal settlementAmount;

    /**
     * 审批操作： makeLoan:放款  settlement结算
     */
    private String auditType;

}
