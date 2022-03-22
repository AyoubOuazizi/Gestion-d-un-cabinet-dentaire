package application;

import java.io.Serializable;

abstract class User implements Serializable{
	private String Login;
	private String Passwd;
	private String name;
	public User(String Login,String Passwd,String name) {
		setLogin(Login);
		setPasswd(Passwd);
		setName(name);
	}
	public String getLogin() {
		return Login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		Passwd = passwd;
	}
}
