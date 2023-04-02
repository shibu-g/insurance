package com.insurance.insurance.Controllers;

import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Entity.Policy;
import com.insurance.insurance.Services.ClientService;
import com.insurance.insurance.Services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/policies")
public class PolicyController {
    @Autowired
    private PolicyService service;

    @GetMapping("/")
    public List<Policy> getall(){
        return service.Getallpolicies();
    }

    @GetMapping("/{id}")
    public Policy getbyid(@PathVariable int id){

        return service.Getpoliciesbyid(id);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addpolicy(@RequestBody Policy p){
        return  new ResponseEntity<String>(  service.addPolicy(p), HttpStatus.CREATED);

    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePolicy(@RequestBody Policy p, @PathVariable int id){

        return  new ResponseEntity<String>(service.updatePolicies(p,id), HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletepolicy(@PathVariable int id){
        return  new ResponseEntity<String>( service.deleteuser(id), HttpStatus.ACCEPTED);

    }
}
