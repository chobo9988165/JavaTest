package com.test.java.auth;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String lv;
	public Member(String id, String w, String name, String lv) {
		this.id = id;
		this.pw = w;
		this.name = name;
		this.lv = lv;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpw() {
		return pw;
	}
	public void setpw(String w) {
		this.pw = w;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLv() {
		return lv;
	}
	public void setLv(String lv) {
		this.lv = lv;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", w=" + pw + ", name=" + name + ", lv=" + lv + "]";
	}
	
	
	

}
