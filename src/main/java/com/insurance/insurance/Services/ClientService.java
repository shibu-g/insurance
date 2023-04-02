package com.insurance.insurance.Services;

import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repo;
    public Client Getclient(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }else{
            Client c=new Client();
            return c;
        }




    }

    public String setclient(Client c){
        try{
            repo.save(c);
            return "User Created Succesfully";
        }catch (Exception e){
            return "User Not Created for this:- "+e.toString();
        }

    }
    public List<Client> getallclient(){
        return repo.findAll();
    }


    public String updateuser(Client c,int id){
        try {
            Client old=repo.findById(id).get();
            old.setName(c.getName());
            old.setDob(c.getDob());
            old.setAddress(c.getAddress());
            old.setContact(c.getContact());
            repo.save(old);
            return "Client updated Succesfully";
        }catch(Exception e){
           return "client update failed because :- "+e.toString();
        }


    }
    public String deleteuser(int id){

      try{
          repo.deleteById(id);
          return "User Deleted Succesfull";
      }catch(Exception e){
          return "user delete not Succesfull"+e.toString();
      }
    }
}
