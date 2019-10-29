package org.light.bean2;

public class UserMember {

	String name;
	String password;

	public UserMember() {
		this.name = new String();
		this.password = new String();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}

}
