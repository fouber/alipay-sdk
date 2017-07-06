package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

/**
 * 商户智能活动配置方案接口
 *
 * @author auto create
 * @since 1.0, 2017-03-31 20:30:59
 */
@ApiModel(description = " 商户智能活动配置方案接口")
public class KoubeiMarketingDataSmartactivityConfigModel extends AlipayObject {

    private static final long serialVersionUID = 2382674253638469223L;

    /**
     * 诊断结果CODE，目前有如下四个值
     * TRADE_RATE	流失会员占比高
     * USER_COUNT	会员数量少
     * REPAY_RATE	复购率低
     * SUPER_ITEM  建议打造单品爆款(适用于菜品营销)
     * 注意：当入参的诊断码为SUPER_ITEM表示菜品营销的诊断时，下面的返回结果中如果有多个菜品时，下面各活动配置的参数使用竖线|来将各个值分隔。例如：菜品名称item_name的值：剁椒鱼头|鱼香茄子，使用横线-表示为空的数据，例如：领券门槛min_cost的值如果没有则返回  -|-,返回和item_id数量一致的横线
     */
    @JSONField(name = "diagnose_code", alternateNames = "diagnoseCode")
    @ApiModelProperty(notes = " 诊断结果CODE，目前有如下四个值TRADE_RATE	流失会员占比高USER_COUNT	会员数量少REPAY_RATE	复购率低SUPER_ITEM  建议打造单品爆款(适用于菜品营销)注意：当入参的诊断码为SUPER_ITEM表示菜品营销的诊断时，下面的返回结果中如果有多个菜品时，下面各活动配置的参数使用竖线|来将各个值分隔。例如：菜品名称item_name的值：剁椒鱼头|鱼香茄子，使用横线-表示为空的数据，例如：领券门槛min_cost的值如果没有则返回  -|-,返回和item_id数量一致的横线")
    @EnumCheck(enums = {"TRADE_RATE", "USER_COUNT", "REPAY_RATE", "SUPER_ITEM"})
    private String diagnoseCode;

    public String getDiagnoseCode() {
        return this.diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

}
