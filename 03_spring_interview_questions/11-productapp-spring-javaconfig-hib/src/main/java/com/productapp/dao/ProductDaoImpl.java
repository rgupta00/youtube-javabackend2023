package com.productapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.productapp.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();//getCurrentSession vs openSession
	}
	@Override
	public List<Product> getAll() {
		return getSession().createQuery("select p from Product p", Product.class).getResultList();
	}

	@Override
	public Product addProduct(Product product) {
		 getSession().save(product);
		 return product;
	}

	@Override
	public Product getById(int productId) {
		return getSession().get(Product.class, productId);
	}

	@Override
	public void deleteProduct(int productId) {
		Product productToDelete= getById(productId);
		getSession().remove(productToDelete);
	}

	@Override
	public void updateProduct(int productId, double productPrice) {
		Product productToUpdate= getById(productId);
		productToUpdate.setPrice(productPrice);
		getSession().merge(productToUpdate);
	}

}





