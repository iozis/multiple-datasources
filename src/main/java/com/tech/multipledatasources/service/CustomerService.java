package com.tech.multipledatasources.service;

import com.tech.multipledatasources.dao.CustomerDAO;
import com.tech.multipledatasources.domain.DatabaseInfo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    public DatabaseInfo getDatabaseInfo(){
        return customerDAO.getDatabaseInfo();
    }
}
