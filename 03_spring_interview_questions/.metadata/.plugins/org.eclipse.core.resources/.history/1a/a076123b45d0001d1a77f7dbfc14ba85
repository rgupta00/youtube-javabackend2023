package com.productapp.dao;

import java.sql.*;

import com.productapp.dto.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.util.JdbcConnectionFactory;
import java.util.*;

public class ProductDaoImpl implements ProductDao {

	private Connection connection;

	public ProductDaoImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<Product>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				products.add(product);
			}
		} catch (SQLException ex) {
		}
		return products;
	}

	@Override
	public Product addProduct(Product product) {

		try {
			String query = "insert into product(name, price) values (?,?)";

			PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			pstmt.setNString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				product.setId(rs.getInt(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return product;
	}

	@Override
	public Product getById(int productId) {
		Product product = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from product where id=?");
			stmt.setInt(1, productId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException ex) {
		}
		
		return product;
	}

	@Override
	public void deleteProduct(int productId) {

		try {
			PreparedStatement stmt = connection.prepareStatement("delete from product where id=?");
			stmt.setInt(1, productId);
			stmt.executeUpdate();

		} catch (SQLException ex) {
		}

	}

	@Override
	public void updateProduct(int productId, double productPrice) {
		try {
			PreparedStatement stmt = connection.prepareStatement("update product set price=? where id=?");
			stmt.setDouble(1, productPrice);
			stmt.setInt(2, productId);
			stmt.executeUpdate();

		} catch (SQLException ex) {
		}
	}

}
