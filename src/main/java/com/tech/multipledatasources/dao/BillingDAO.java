package com.tech.multipledatasources.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tech.multipledatasources.domain.DatabaseInfo;

@Repository
public class BillingDAO implements IDatabaseDAO{
    
    private JdbcTemplate jdbcTemplate;
    
    @Value("${database.sql.databasename}")
    private String sql;

    public BillingDAO(@Qualifier("billingDataSource")DataSource datasource) {
        jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public DatabaseInfo getDatabaseInfo() {
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<DatabaseInfo>(DatabaseInfo.class));
    }
}
