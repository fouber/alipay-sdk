package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 会员卡模板外部权益删除
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:27
 */
@ApiModel(description = " 会员卡模板外部权益删除")
public class AlipayMarketingCardBenefitDeleteModel extends AlipayObject {


    /**
     * 权益ID
     */
    @ApiModelProperty(notes = " 权益ID")
    @JSONField(alternateNames = "benefitId", name = "benefit_id")
    @NotBlank
    private String benefitId;

    /**
     * 会员卡模板ID
     */
    @ApiModelProperty(notes = " 会员卡模板ID")
    @JSONField(alternateNames = "templateId", name = "template_id")
    @NotBlank
    private String templateId;

    public String getBenefitId() {
        return this.benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
