package com.ace.xiaochongtech.simulate.models.operation;

import java.util.List;

import com.ace.xiaochongtech.simulate.models.db.WebsiteInfo;

/**
 * 

 * @ClassName: Module

 * @Description: 
 *   	运行
 *	 	货物类

 * @author: admin

 * @date: 2019年4月11日 下午5:37:15
 */
public class Module {
	
	private String mobile;
	
	private List<WebsiteInfo> websiteList;
	
	public Module(String mobile, List<WebsiteInfo> websiteList) {
		super();
		this.mobile = mobile;
		this.websiteList = websiteList;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<WebsiteInfo> getWebsiteList() {
		return websiteList;
	}

	public void setWebsiteList(List<WebsiteInfo> websiteList) {
		this.websiteList = websiteList;
	}
	
	
	
	
	
	
	

}
