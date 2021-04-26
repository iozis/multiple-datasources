package com.tech.multipledatasources.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatasourceConfig {

	Environment env;
	
	public DatasourceConfig(Environment env) {
		this.env = env;
	}

	@Bean(name = "customerDataSource")
    public DataSource customerDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.customerdatasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.customerdatasource.url"));
        dataSource.setUsername(env.getProperty("spring.customerdatasource.username"));
        dataSource.setPassword(env.getProperty("spring.customerdatasource.password"));

        return dataSource;
    }

    @Bean(name = "billingDataSource")
    public DataSource billingDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.billingdatasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.billingdatasource.url"));
        dataSource.setUsername(env.getProperty("spring.billingdatasource.username"));
        dataSource.setPassword(env.getProperty("spring.billingdatasource.password"));

        return dataSource;
    }
    
}
