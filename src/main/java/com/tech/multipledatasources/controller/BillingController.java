package com.tech.multipledatasources.controller;

import com.tech.multipledatasources.domain.DatabaseInfo;
import com.tech.multipledatasources.service.BillingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
    
    private BillingService billingService;

    public BillingController(BillingService billingService){
        this.billingService = billingService;
    }

    @GetMapping("/dsinfo")
    public ResponseEntity<DatabaseInfo> getDatasourceInfo(){
        return ResponseEntity.ok(billingService.getDatabaseInfo());
    }
}
