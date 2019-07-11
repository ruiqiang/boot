package com.ruiqiang.sp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * z_loan
 * @author 
 */
public class ZLoan implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 借款金额
     */
    private BigDecimal loanamount;

    /**
     * 借款状态 0=>未借 1=>申请中 2=>审核通过 3=>审核拒绝 4=>已放款 5=>已还款 6=>逾期
     */
    private Integer status;

    /**
     * 生成时间
     */
    private Date addtime;

    /**
     * 最近更新时间
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}