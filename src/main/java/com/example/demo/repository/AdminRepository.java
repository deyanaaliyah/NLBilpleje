package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminRepository  {
    List<Admin> admins;


    public AdminRepository(){
        this.admins = new ArrayList<>();
        this.admins.add(new Admin("nl","1234"));
    }

    public Admin read(String username, String password) {
        for(Admin adminToReturn : admins){
            if(adminToReturn.getUsername().equals(username) && adminToReturn.getPassword().equals(password)){
                return adminToReturn;
            }
        }
        return null;
    }
}