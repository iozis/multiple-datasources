package com.tech.multipledatasources.service;

import com.tech.multipledatasources.dao.BillingDAO;
import com.tech.multipledatasources.domain.DatabaseInfo;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    
    private BillingDAO billingDAO;

    public BillingService(BillingDAO billingDAO){
        this.billingDAO = billingDAO;
    }

    public DatabaseInfo getDatabaseInfo(){
        return billingDAO.getDatabaseInfo();
    }
}
