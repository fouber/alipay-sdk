package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class BudgetInfo extends AlipayObject {

    private static final long serialVersionUID = 4797456631952762267L;

    /**
     * 预算数量
     */
    @JSONField(name = "budget_total", alternateNames = "budgetTotal")
    private String budgetTotal;

    /**
     * 预算类型
     */
    @JSONField(name = "budget_type", alternateNames = "budgetType")
    private String budgetType;

    public String getBudgetTotal() {
        return this.budgetTotal;
    }

    public void setBudgetTotal(String budgetTotal) {
        this.budgetTotal = budgetTotal;
    }

    public String getBudgetType() {
        return this.budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

}
