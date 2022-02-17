package main.java.br.com.myecommerce.dao;

import main.java.br.com.myecommerce.models.User;

import javax.persistence.TypedQuery;

public class UserDao extends GenericDao<User>{

	public UserDao() {
		super(User.class);
	}
	
	public User findUserByEmail(String email) {
		String JPQL = "SELECT a FROM " + User.class.getSimpleName() + " a where login= '" + email +"'";
		TypedQuery<User> result = super.getManager().createQuery(JPQL , User.class);
		return result.getSingleResult();
	}
}
