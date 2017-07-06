package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的说明条款
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class ClauseTerm extends AlipayObject {

    private static final long serialVersionUID = 1494981959284633896L;

    /**
     * 说明描述内容
     */
    private List<String> descriptions;

    /**
     * 说明title
     */
    private String title;

    public List<String> getDescriptions() {
        return this.descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
