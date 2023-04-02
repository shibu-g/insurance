package com.insurance.insurance.Services;

import com.insurance.insurance.Entity.Claims;
import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Repositories.ClaimRepository;
import com.insurance.insurance.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository repo;
    public Claims GetClaimbyid(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }else{
            Claims C=new Claims();
            C.setDescription("no claims present with this id");
            return C;
        }


    }

    public String addnewClaim(Claims c){
        try{
            repo.save(c);
            return "Your Claims Creation is Succesfully";
        }catch (Exception e){
            return "Your Claims Creation is Not Succesfull for this:- "+e.toString();
        }

    }
    public List<Claims> getallClaims(){
        return repo.findAll();
    }
    public String updateClaim(Claims c,int id){
        try {
            Claims old=repo.findById(id).get();
            old.setDate(c.getDate());
            old.setDescription(c.getDescription());
            old.setStatus(c.getStatus());
            old.setPolicy_no(c.getPolicy_no());
            repo.save(old);
            return "Claim updated Succesfully";
        }catch(Exception e){
            return "claim update failed because :- "+e.toString();
        }


    }
    public String deleteClaim(int id){

        try{
            repo.deleteById(id);
            return "Claim Deleted Succesfull";
        }catch(Exception e){
            return "Claim delete not Succesfull"+e.toString();
        }
    }
}

