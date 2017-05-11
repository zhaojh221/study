package com.ootb.springcloud.ribbon.vo;

public class User {

	private Long id;
	private String userName;
	private Integer age;
	private String gender;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", userName=" + userName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
