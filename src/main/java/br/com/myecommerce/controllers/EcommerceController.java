package main.java.br.com.myecommerce.controllers;

import main.java.br.com.myecommerce.dao.ProductDao;
import main.java.br.com.myecommerce.models.Product;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "ecommerceController", eager = true)
@ApplicationScoped
public class EcommerceController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;
	
	private static List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}
	
	public static void findAllProducts() {
		ProductDao productDao = new ProductDao();
 		products = productDao.fi1ndAll();
	}
}
