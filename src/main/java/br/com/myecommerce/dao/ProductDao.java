package main.java.br.com.myecommerce.dao;


import main.java.br.com.myecommerce.models.Product;

public class ProductDao extends main.java.br.com.myecommerce.dao.GenericDao<Product> {

	public ProductDao() {
		super(Product.class);
	}
}
