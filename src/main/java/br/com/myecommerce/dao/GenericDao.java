package main.java.br.com.myecommerce.dao;

import main.java.br.com.myecommerce.utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class GenericDao <T> {
	
    private final EntityManager manager = JPAUtil.getEntityManager();
	
	private final Class<T> clazz;
	
	public GenericDao(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T getById(Long id) {
		return getManager().find(clazz, id);
	}

	public List<T> findAll() { 
		String JPQL = "SELECT a FROM " + clazz.getSimpleName() + " a";
		TypedQuery<T> q = getManager().createQuery(JPQL , clazz);
		return q.getResultList();
	}

	public void save(T clazz) {
		getManager().getTransaction().begin();
		getManager().persist(clazz);
		getManager().getTransaction().commit();
	}

	public void update(T clazz) {
		getManager().getTransaction().begin();
		getManager().merge(clazz);
		getManager().getTransaction().commit();
	}

	public void delete(T clazz) {
		getManager().getTransaction().begin();
		getManager().remove(clazz);
		getManager().getTransaction().commit();
	}

	public void delete(Long id) {
		delete(getById(id));
	}

	public EntityManager getManager() {
		return manager;
	}
}
