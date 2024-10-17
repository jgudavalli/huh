package com.homeo.web.firstattempt.homeowithhimaja.beans;

import java.util.ArrayList;

public class CDetails {
	  
	String fullName;
	   String email;
	   String mobile;
	   String msg;
	   
	
	
	   public CDetails(String fullName, String email, String mobile, String msg) {
			super();
			this.fullName = fullName;
			this.email = email;
			this.mobile = mobile;
			this.msg = msg;
		}
   public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

   
   
   
}
