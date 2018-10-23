package com.albedo.java.vo.biz;

import com.alibaba.fastjson.annotation.JSONField;
import com.albedo.java.util.PublicUtil;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengChao
 * @Title: LoanStatusModifiedVo
 * @ProjectName UALoan
 * @Description: TODO UA接收前端或者app传来数据vo
 * @date 2018/9/12
 */
@Data
public class LoanStatusModifiedVo implements Serializable {

    /** contractNo 合同编码 */
    @NotBlank
    private String contractNo;

    /** jumpProcess 跳转流程 */
    @NotBlank
    private String jumpProcess;

    /** remark 备注信息 */
    private String remark;

    /** oldProcess 原流程 */
    private String oldProcess;

    // ======================
    /*    补充资料     */
    private String supplyMaterial;

    // ======================
    /*    原因     */
    private String reason;

    /** productNo 放款产品 */
    private String productNo;

    /** productCycle 放款期数 */
    private Long productCycle;

    /** loanAmount 放款金额 */
    private BigDecimal loanAmount;

    /**
     * 月还款
     */
    private BigDecimal perMonthPayment;

    /**
     * 时间(预约时间、放款时间、回退时间等)
     */
    @JSONField(format = PublicUtil.TIME_FORMAT)
    private Date time;
}
