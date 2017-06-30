package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertIdentifyResponse;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.advert.commission.advert.purchase response.
 *
 * @author auto create
 * @since 1.0, 2017-01-17 21:29:21
 */
@ApiModel(description = " ALIPAY API: koubei.advert.commission.advert.purchase response.")
public class KoubeiAdvertCommissionAdvertPurchaseResponse extends AlipayResponse {

    private static final long serialVersionUID = 7863981983376465694L;

    /**
     * 主键Code结果，采购请求是批量形式的，每个identify，对应一个处理结果
     */
    @ApiModelProperty(notes = " 主键Code结果，采购请求是批量形式的，每个identify，对应一个处理结果")
    @ApiListField("identify_codes")
    @ApiField("kb_advert_identify_response")
    private List<KbAdvertIdentifyResponse> identifyCodes;

    public void setIdentifyCodes(List<KbAdvertIdentifyResponse> identifyCodes) {
        this.identifyCodes = identifyCodes;
    }

    public List<KbAdvertIdentifyResponse> getIdentifyCodes() {
        return this.identifyCodes;
    }

}
