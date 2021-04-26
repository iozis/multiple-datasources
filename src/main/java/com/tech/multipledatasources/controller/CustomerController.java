package com.tech.multipledatasources.controller;

import com.tech.multipledatasources.domain.DatabaseInfo;
import com.tech.multipledatasources.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }
    
    @GetMapping("/dsinfo")
    public ResponseEntity<DatabaseInfo> getDatasourceInfo(){
        return ResponseEntity.ok(customerService.getDatabaseInfo());
    }
}

