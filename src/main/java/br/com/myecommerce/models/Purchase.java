package main.java.br.com.myecommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter@Setter
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String date;
	
	private String buyerFullName;
	
	private String buyerCreditCard;
	
	private String buyerSecurityCode;
	
	private Double amount;
	
	private Long productId;

}
