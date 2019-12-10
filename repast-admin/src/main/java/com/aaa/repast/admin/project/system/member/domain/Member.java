package com.aaa.repast.admin.project.system.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 会员表 ums_member
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
public class Member extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long shopId;
	/**  */
	private Long memberLevelId;
	/** 用户名 */
	private String username;
	/** 密码 */
	private String password;
	/** 昵称 */
	private String nickname;
	/** 手机号码 */
	private String phone;
	/** 帐号启用状态:0->禁用；1->启用 */
	private Integer status;
	/** 注册时间 */
	private Date createTime;
	/** 头像 */
	private String icon;
	/** 性别：0->未知；1->男；2->女 */
	private Integer gender;
	/** 生日 */
	private Date birthday;
	/** 所做城市 */
	private String city;
	/** 职业 */
	private String job;
	/** 个性签名 */
	private String personalizedSignature;
	/** 用户来源 */
	private Integer sourceType;
	/** 积分 */
	private Integer integration;
	/** 成长值 */
	private Integer growth;
	/** 剩余抽奖次数 */
	private Integer luckeyCount;
	/** 历史积分数量 */
	private Integer historyIntegration;
	/**  */
	private Long parentId;
	/** 微信返回的open_id */
	private String openId;
	/** 微信返回的session_key */
	private String sessionKey;
	/** 登录验证token */
	private String token;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setShopId(Long shopId) 
	{
		this.shopId = shopId;
	}

	public Long getShopId() 
	{
		return shopId;
	}
	public void setMemberLevelId(Long memberLevelId) 
	{
		this.memberLevelId = memberLevelId;
	}

	public Long getMemberLevelId() 
	{
		return memberLevelId;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getUsername() 
	{
		return username;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}

	public String getNickname() 
	{
		return nickname;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setStatus(Integer status) 
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setIcon(String icon) 
	{
		this.icon = icon;
	}

	public String getIcon() 
	{
		return icon;
	}
	public void setGender(Integer gender) 
	{
		this.gender = gender;
	}

	public Integer getGender() 
	{
		return gender;
	}
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}

	public Date getBirthday() 
	{
		return birthday;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getCity() 
	{
		return city;
	}
	public void setJob(String job) 
	{
		this.job = job;
	}

	public String getJob() 
	{
		return job;
	}
	public void setPersonalizedSignature(String personalizedSignature) 
	{
		this.personalizedSignature = personalizedSignature;
	}

	public String getPersonalizedSignature() 
	{
		return personalizedSignature;
	}
	public void setSourceType(Integer sourceType) 
	{
		this.sourceType = sourceType;
	}

	public Integer getSourceType() 
	{
		return sourceType;
	}
	public void setIntegration(Integer integration) 
	{
		this.integration = integration;
	}

	public Integer getIntegration() 
	{
		return integration;
	}
	public void setGrowth(Integer growth) 
	{
		this.growth = growth;
	}

	public Integer getGrowth() 
	{
		return growth;
	}
	public void setLuckeyCount(Integer luckeyCount) 
	{
		this.luckeyCount = luckeyCount;
	}

	public Integer getLuckeyCount() 
	{
		return luckeyCount;
	}
	public void setHistoryIntegration(Integer historyIntegration) 
	{
		this.historyIntegration = historyIntegration;
	}

	public Integer getHistoryIntegration() 
	{
		return historyIntegration;
	}
	public void setParentId(Long parentId) 
	{
		this.parentId = parentId;
	}

	public Long getParentId() 
	{
		return parentId;
	}
	public void setOpenId(String openId) 
	{
		this.openId = openId;
	}

	public String getOpenId() 
	{
		return openId;
	}
	public void setSessionKey(String sessionKey) 
	{
		this.sessionKey = sessionKey;
	}

	public String getSessionKey() 
	{
		return sessionKey;
	}
	public void setToken(String token) 
	{
		this.token = token;
	}

	public String getToken() 
	{
		return token;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("memberLevelId", getMemberLevelId())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("nickname", getNickname())
            .append("phone", getPhone())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("icon", getIcon())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("city", getCity())
            .append("job", getJob())
            .append("personalizedSignature", getPersonalizedSignature())
            .append("sourceType", getSourceType())
            .append("integration", getIntegration())
            .append("growth", getGrowth())
            .append("luckeyCount", getLuckeyCount())
            .append("historyIntegration", getHistoryIntegration())
            .append("parentId", getParentId())
            .append("openId", getOpenId())
            .append("sessionKey", getSessionKey())
            .append("token", getToken())
            .toString();
    }
}
