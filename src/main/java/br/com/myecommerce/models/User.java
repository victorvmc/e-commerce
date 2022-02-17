package main.java.br.com.myecommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter@Setter
public class User {
	
	@Id
	private String login;
	
	private String password;
	
	private String fullName;
	
	private String cpf;
	
	private String address;
	
	private String phoneNumber;
	
	private boolean adminFlag;
	
}
