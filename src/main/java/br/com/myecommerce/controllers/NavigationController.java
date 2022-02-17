package main.java.br.com.myecommerce.controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@ApplicationScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;
	
	public static String goToLoginPage() {
		return "login";
	}
	
	public static String goToHomePage() {
		EcommerceController.findAllProducts();
		return "index";
	}
	
	public String goToRegistrationPage() {
		return "registration";
	}
	
	public String goToPurchasePage() {
		return "purchase";
	}
	
	public String goToStorePage() {
		EcommerceController.findAllProducts();
		return "store";
	}
	
}
