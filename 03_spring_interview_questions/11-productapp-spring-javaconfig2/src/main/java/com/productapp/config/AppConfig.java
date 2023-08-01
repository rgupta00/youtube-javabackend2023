package com.productapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring jdbc 
@Configuration
@ComponentScan(basePackages = {"com.productapp"})
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class AppConfig {

	@Autowired
	private Environment environment;
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate template=new JdbcTemplate(dataSource);
		return template;
	}
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUsername(environment.getProperty("jdbc.username"));
		ds.setPassword(environment.getProperty("jdbc.password"));
		ds.setDriverClassName(environment.getProperty("jdbc.drivername"));
		ds.setUrl(environment.getProperty("jdbc.url"));
		
		return ds;
	}
	
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
		DataSourceTransactionManager txMgr=new DataSourceTransactionManager(dataSource);
		return txMgr;
	}
	
}
