package manytag.common.dao.entity;

import manytag.framework.dispatch.base.BaseEntity;
import manytag.framework.util.DateUtil;

public class SystemRolesEntity extends BaseEntity {
	private String uid;
	private String code;
	private String name;
	private String memo;
	private java.util.Date createTime;
	private String createTimeStr;
	private String createUser;
	private java.util.Date updateTime;
	private String updateTimeStr;
	private String updateUser;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
		if (createTime != null) {
			this.createTimeStr = DateUtil.longToDateStr(createTime.getTime());
		}
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
		if (createTimeStr != null && !"".equals(createTimeStr)) {
			this.createTime = new java.util.Date(DateUtil.dateStrToLong(createTimeStr));
		}
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
		if (updateTime != null) {
			this.updateTimeStr = DateUtil.longToDateStr(updateTime.getTime());
		}
	}

	public String getUpdateTimeStr() {
		return updateTimeStr;
	}

	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
		if (updateTimeStr != null && !"".equals(updateTimeStr)) {
			this.updateTime = new java.util.Date(DateUtil.dateStrToLong(updateTimeStr));
		}
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}