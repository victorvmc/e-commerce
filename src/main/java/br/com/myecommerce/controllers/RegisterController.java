package main.java.br.com.myecommerce.controllers;

import main.java.br.com.myecommerce.dao.UserDao;
import main.java.br.com.myecommerce.models.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;


@ManagedBean(name = "registerController", eager = true)
@ApplicationScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;

	private String login;
	private String password;
	private String fullName;
	private String cpf;
	private String address;
	private String phoneNumber;
	private boolean adminFlag;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(boolean adminFlag) {
		this.adminFlag = adminFlag;
	}

	public String registrationUser() {
		User user = new User();
		UserDao userDao = new UserDao();
		
		user.setLogin(login);
		user.setPassword(password);
		user.setFullName(fullName);
		user.setCpf(cpf);
		user.setAddress(address);
		user.setPhoneNumber(phoneNumber);
		user.setAdminFlag(false);
		
		userDao.save(user);
		
		return NavigationController.goToLoginPage();
	}
}
