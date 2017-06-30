package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

/**
 * 任务条款抽象模型
 *
 * @author auto create
 * @since 1.0, 2017-04-06 11:46:57
 */@ApiModel(description = " 任务条款抽象模型")
public class KbAdvertCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 3357845431312457548L;

	/**
	 * 条款类型（条款类型是什么，下面填的条款就是什么）
PERCENTAGE_CLAUSE：比例分佣条款
QUOTA_CLAUSE：固定金额
MISSION_CLAIM_CLAUSE:专属认领人条款
	 */@ApiModelProperty(notes = " 条款类型（条款类型是什么，下面填的条款就是什么）PERCENTAGE_CLAUSE：比例分佣条款QUOTA_CLAUSE：固定金额MISSION_CLAIM_CLAUSE:专属认领人条款")
	@ApiField("clause_type")
	@EnumCheck(enums = {"PERCENTAGE_CLAUSE","QUOTA_CLAUSE","MISSION_CLAIM_CLAUSE"})
	private String clauseType;

	/**
	 * 比例分佣条款
rate的最小值通过koubei.advert.data.conf.query获取，最大值为100；
max的范围可通过koubei.advert.data.conf.query获取
	 */@ApiModelProperty(notes = " 比例分佣条款rate的最小值通过koubei.advert.data.conf.query获取，最大值为100；max的范围可通过koubei.advert.data.conf.query获取")
	@ApiField("percentage_clause")
	private KbAdvertPercentageCommissionClause percentageClause;

	/**
	 * 专属人员条款
	 */@ApiModelProperty(notes = " 专属人员条款")
	@ApiField("preserve_clause")
	private KbAdvertPreserveCommissionClause preserveClause;

	/**
	 * 固定金额条款
固定金额的范围可通过koubei.advert.data.conf.query获取
	 */@ApiModelProperty(notes = " 固定金额条款固定金额的范围可通过koubei.advert.data.conf.query获取")
	@ApiField("quota_clause")
	private KbAdvertQuotaCommissionClause quotaClause;

	public String getClauseType() {
		return this.clauseType;
	}
	public void setClauseType(String clauseType) {
		this.clauseType = clauseType;
	}

	public KbAdvertPercentageCommissionClause getPercentageClause() {
		return this.percentageClause;
	}
	public void setPercentageClause(KbAdvertPercentageCommissionClause percentageClause) {
		this.percentageClause = percentageClause;
	}

	public KbAdvertPreserveCommissionClause getPreserveClause() {
		return this.preserveClause;
	}
	public void setPreserveClause(KbAdvertPreserveCommissionClause preserveClause) {
		this.preserveClause = preserveClause;
	}

	public KbAdvertQuotaCommissionClause getQuotaClause() {
		return this.quotaClause;
	}
	public void setQuotaClause(KbAdvertQuotaCommissionClause quotaClause) {
		this.quotaClause = quotaClause;
	}

}
