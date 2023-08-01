package com.productapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.productapp.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private EntityManagerFactory emf;
	
	@Autowired
	public ProductDaoImpl(EntityManagerFactory emf) {
		this.emf = emf;
	}

	private EntityManager getEm() {
		return emf.createEntityManager();
	}
	@Override
	public List<Product> getAll() {
		return getEm().createQuery("select p from Product p", Product.class).getResultList();
	}

	@Override
	public Product addProduct(Product product) {
		getEm().persist(product);
		 return product;
	}

	@Override
	public Product getById(int productId) {
		return getEm().find(Product.class, productId);
	}

	@Override
	public void deleteProduct(int productId) {
		Product productToDelete= getById(productId);
		getEm().remove(productToDelete);
	}

	@Override
	public void updateProduct(int productId, double productPrice) {
		Product productToUpdate= getById(productId);
		productToUpdate.setPrice(productPrice);
		getEm().merge(productToUpdate);
	}

}





