package com.productapp.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring jdbc 
@Configuration
@ComponentScan(basePackages = {"com.productapp"})
@EnableTransactionManagement
@Import(DbConfig.class)
public class AppConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean=new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setPackagesToScan(new String[] {"com.productapp.entity"});
		
		factoryBean.setJpaVendorAdapter( new HibernateJpaVendorAdapter());
		factoryBean.setJpaProperties(hibernateProperites());
		return factoryBean;
	}
	
//	@Bean
//	public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource) {
//		LocalSessionFactoryBean factoryBean=new LocalSessionFactoryBean();
//		factoryBean.setDataSource(dataSource);
//		factoryBean.setPackagesToScan(new String[] {"com.productapp.entity"});
//		
//		factoryBean.setHibernateProperties( hibernateProperites());
//		return factoryBean;
//	}
	
	private Properties hibernateProperites() {
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		
		return properties;
	}

	@Bean
	public JpaTransactionManager hibernateTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager jpaTxMgr=new JpaTransactionManager(emf);
		
		return jpaTxMgr;
	}
}
