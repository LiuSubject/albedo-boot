package com.albedo.java.vo.biz;

import com.alibaba.fastjson.annotation.JSONField;
import com.albedo.java.util.PublicUtil;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 批量审批信息
 * @author yanting
 * @date 2018-10-12
 */
@Data
public class BatchLoanStatusModifiedVo  {

    /** contractNos 合同编码列表 */
    @NotBlank
    private List<String> contractNos;

    /** jumpProcess 跳转流程 */
    @NotBlank
    private String jumpProcess;

    /** remark 备注信息 */
    private String remark;

    /** oldProcess 原流程 */
    private String oldProcess;

    private String reason;

    /** productNo 放款产品编号 */
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

    public List<LoanStatusModifiedVo> toLoanStatusModifyList(){

        List<LoanStatusModifiedVo> list = new ArrayList<>();

        for(String contractNo : contractNos){

            LoanStatusModifiedVo loanStatusVo = new LoanStatusModifiedVo();
            loanStatusVo.setContractNo(contractNo);
            loanStatusVo.setJumpProcess(jumpProcess);
            loanStatusVo.setRemark(remark);
            loanStatusVo.setReason(reason);
            loanStatusVo.setProductNo(productNo);
            loanStatusVo.setProductCycle(productCycle);
            loanStatusVo.setLoanAmount(loanAmount);

            list.add(loanStatusVo);

        }

        return list;

    }
}
