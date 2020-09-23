package cn.ekgc.starsoceans.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>星海-基础架构-基础实体类信息</b>
 * @author HuangXi
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -6836047635490457240L;
	private Integer status;                 // 系统状态: 0-禁用;1-启用
	private String createUser;              // 创建人
	private Date createTime;                // 创建时间
	private String updateUser;              // 修改人
	private Date updateTime;                // 修改时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
