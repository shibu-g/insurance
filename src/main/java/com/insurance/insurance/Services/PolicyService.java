package com.insurance.insurance.Services;

import com.insurance.insurance.Entity.Client;
import com.insurance.insurance.Entity.Policy;
import com.insurance.insurance.Repositories.ClientRepository;
import com.insurance.insurance.Repositories.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository repo;
    public Policy Getpoliciesbyid(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }else{
            Policy p=new Policy();
            return p;
        }


    }

    public String addPolicy(Policy p){
        try{
            repo.save(p);
            return "New Policies Created Succesfully";
        }catch (Exception e){
            return "Policies not Created for this:- "+e.toString();
        }

    }
    public List<Policy> Getallpolicies(){

        return repo.findAll();
    }
    public String updatePolicies(Policy p,int id){
        try {
            Policy old=repo.findById(id).get();
            old.setCovarage(p.getCovarage());
            old.setType(p.getType());
            old.setPremium(p.getPremium());
            repo.save(old);
            return "Policy updated Succesfully";
        }catch(Exception e){
            return "Policy update failed because :- "+e.toString();
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
