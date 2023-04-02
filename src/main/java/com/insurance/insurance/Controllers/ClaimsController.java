package com.insurance.insurance.Controllers;

import com.insurance.insurance.Entity.Claims;
import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/claims")
public class ClaimsController {
    @Autowired
    private ClaimService service;
    @GetMapping("/")
    public List<Claims> getall(){
        return service.getallClaims();
    }

    @GetMapping("/{id}")
    public Claims getbyid(@PathVariable int id){

        return service.GetClaimbyid(id);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addClaim(@RequestBody Claims c){
        return  new ResponseEntity<String>(  service.addnewClaim(c), HttpStatus.CREATED);

    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateclaim(@RequestBody Claims c, @PathVariable int id){

        return  new ResponseEntity<String>(service.updateClaim(c,id), HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteclaim(@PathVariable int id){
        return  new ResponseEntity<String>( service.deleteClaim(id), HttpStatus.ACCEPTED);

    }

}
