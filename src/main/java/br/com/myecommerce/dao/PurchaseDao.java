package main.java.br.com.myecommerce.dao;


import main.java.br.com.myecommerce.models.Purchase;

public class PurchaseDao extends GenericDao<Purchase>{

	PurchaseDao() {
		super(Purchase.class);
	}
}
