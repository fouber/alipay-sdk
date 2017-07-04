package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 专属领取人员
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */@ApiModel(description = " 专属领取人员")
public class KbAdvertPreserveCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 7768491187627337896L;

	/**
	 * user_id：支付宝账户ID(2088开头)
logon_id：登陆账号
	 */@ApiModelProperty(notes = " user_id：支付宝账户ID(2088开头)logon_id：登陆账号")
	@ApiField("claimer_id_type")
	@EnumCheck(enums = {"user_id","logon_id"})
	private String claimerIdType;

	/**
	 * 认领人
	 */@ApiModelProperty(notes = " 认领人")
	@ApiListField("claimers")
	@ApiField("string")
	@NotNull
	private List<String> claimers;

	public String getClaimerIdType() {
		return this.claimerIdType;
	}
	public void setClaimerIdType(String claimerIdType) {
		this.claimerIdType = claimerIdType;
	}

	public List<String> getClaimers() {
		return this.claimers;
	}
	public void setClaimers(List<String> claimers) {
		this.claimers = claimers;
	}

}
