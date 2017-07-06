package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 口碑客分佣创建
 *
 * @author auto create
 * @since 1.0, 2017-04-06 13:54:46
 */
@ApiModel(description = " 口碑客分佣创建")
public class KoubeiAdvertCommissionMissionCreateModel extends AlipayObject {

    private static final long serialVersionUID = 7885872367797346354L;

    /**
     * 条款分如下三种条款，同时“单品券”只能设置固定金额，“全场券”只能设置  比例的。
     * PERCENTAGE_CLAUSE：百分比分佣结算条款，和"固定金额分佣结算条款"互斥，条款设置要求，可从koubei.advert.data.conf.query获取
     * QUOTA_CLAUSE：固定金额分佣结算条款
     * MISSION_CLAIM_CLAUSE：专属认领人条款，设定专属人条款，则只能条款中指定人员claimers可认领
     */
    @ApiModelProperty(notes = " 条款分如下三种条款，同时“单品券”只能设置固定金额，“全场券”只能设置  比例的。 PERCENTAGE_CLAUSE：百分比分佣结算条款，和\"固定金额分佣结算条款\"互斥，条款设置要求，可从koubei.advert.data.conf.query获取 QUOTA_CLAUSE：固定金额分佣结算条款 MISSION_CLAIM_CLAUSE：专属认领人条款，设定专属人条款，则只能条款中指定人员claimers可认领")
    @JSONField(name = "commission_clause", alternateNames = "commissionClause")
    @NotNull
    private List<KbAdvertCommissionClause> commissionClause;

    /**
     * 主键ID，根据identify_type，设置相应的ID
     * activity_id:运营活动ID，可以通过koubei.marketing.campaign.activity.create获取
     * voucher：商品ID，可以在商家中心创建商品获得
     */
    @ApiModelProperty(notes = " 主键ID，根据identify_type，设置相应的ID activity_id:运营活动ID，可以通过koubei.marketing.campaign.activity.create获取 voucher：商品ID，可以在商家中心创建商品获得")
    private String identify;

    /**
     * 主键类型，需要配置分佣任务的标的ID，现在主要支持如下两种
     * activity_id：运营活动ID
     * voucher：商品ID
     */
    @ApiModelProperty(notes = " 主键类型，需要配置分佣任务的标的ID，现在主要支持如下两种 activity_id：运营活动ID voucher：商品ID")
    @JSONField(name = "identify_type", alternateNames = "identifyType")
    @EnumCheck(enums = {"activity_id", "voucher"})
    private String identifyType;

    /**
     * 分佣任务名称，由于不在任何场景不显示，因此可ISV按自己需求自行定义
     */
    @ApiModelProperty(notes = " 分佣任务名称，由于不在任何场景不显示，因此可ISV按自己需求自行定义")
    @NotBlank
    @Length(max = 128)
    private String name;

    /**
     * 操作人id，必须和operator_type配对出现，不填时默认是商户ID
     * MERCHANT时填商户ID，同时服务商创建分佣任务，需要审批
     * PROVIDER时填写服务商ID
     */
    @ApiModelProperty(notes = " 操作人id，必须和operator_type配对出现，不填时默认是商户ID MERCHANT时填商户ID，同时服务商创建分佣任务，需要审批 PROVIDER时填写服务商ID")
    @JSONField(name = "operator_id", alternateNames = "operatorId")
    private String operatorId;

    /**
     * 操作人类型,有以下值可填选项（默认不需要填这个字段，默认为MERCHANT）：
     * MERCHANT：外部商户
     * PROVIDER：服务商
     */
    @ApiModelProperty(notes = " 操作人类型,有以下值可填选项（默认不需要填这个字段，默认为MERCHANT）： MERCHANT：外部商户 PROVIDER：服务商")
    @JSONField(name = "operator_type", alternateNames = "operatorType")
    @EnumCheck(enums = {"MERCHANT", "PROVIDER"}, required = false)
    private String operatorType;

    /**
     * 智能营销信息
     * 通过koubei.marketing.data.smartactivity.config接口ext_info字段获取
     * plan_id：为ext_info中的SMART_PROMO_PLAN_ID（方案ID）
     * group_id：为ext_info中的SMART_PROMO_GROUP_ID(方案组ID),
     * 对于和智能营销无关的场景，可以不输入该字段
     */
    @ApiModelProperty(notes = " 智能营销信息 通过koubei.marketing.data.smartactivity.config接口ext_info字段获取 plan_id：为ext_info中的SMART_PROMO_PLAN_ID（方案ID） group_id：为ext_info中的SMART_PROMO_GROUP_ID(方案组ID), 对于和智能营销无关的场景，可以不输入该字段")
    @JSONField(name = "smart_promo", alternateNames = "smartPromo")
    private KbadvertSmartPromoRequest smartPromo;

    public List<KbAdvertCommissionClause> getCommissionClause() {
        return this.commissionClause;
    }

    public void setCommissionClause(List<KbAdvertCommissionClause> commissionClause) {
        this.commissionClause = commissionClause;
    }

    public String getIdentify() {
        return this.identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public KbadvertSmartPromoRequest getSmartPromo() {
        return this.smartPromo;
    }

    public void setSmartPromo(KbadvertSmartPromoRequest smartPromo) {
        this.smartPromo = smartPromo;
    }

}
