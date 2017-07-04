package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 签约情况
 *
 * @author auto create
 * @since 1.0, 2017-02-10 14:26:07
 */@ApiModel(description = " 签约情况")
public class KbadvertRoleInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 8826988181976971465L;

	/**
	 * 角色code
	 */@ApiModelProperty(notes = " 角色code")
	@ApiField("role_code")
	private String roleCode;

	/**
	 * NOT_OPEN:未开通
OPENED:已经开通
	 */@ApiModelProperty(notes = " NOT_OPEN:未开通OPENED:已经开通")
	@ApiField("status")
	private String status;

	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
