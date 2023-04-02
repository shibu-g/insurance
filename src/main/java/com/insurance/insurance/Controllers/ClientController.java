package com.insurance.insurance.Controllers;

import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clients")
public class ClientController {
   @Autowired
    private ClientService service;

   @GetMapping("/")
   public List<Client> getall(){
       return service.getallclient();
   }

   @GetMapping("/{id}")
   public Client getbyid(@PathVariable int id){

       return service.Getclient(id);
   }
   @PostMapping("/add")
   public ResponseEntity<String> addclient(@RequestBody Client c){
       return  new ResponseEntity<String>(  service.setclient(c), HttpStatus.CREATED);

   }
   @PutMapping("/{id}")
    public ResponseEntity<String> updateuser(@RequestBody Client c, @PathVariable int id){

       return  new ResponseEntity<String>(service.updateuser(c,id), HttpStatus.ACCEPTED);

   }

   @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteuser(@PathVariable int id){
       return  new ResponseEntity<String>( service.deleteuser(id), HttpStatus.ACCEPTED);

   }

}
