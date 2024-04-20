package com.application.orderIT.service;

import com.application.orderIT.entity.userRecord;
import com.application.orderIT.repository.userRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userRecordService {

    private final userRecordRepository repository;

    @Autowired
    public userRecordService(userRecordRepository repository) {

        this.repository = repository;
    }

    public List<userRecord> getAllUsers() {
        return repository.findAll();
    }


    public boolean addUser(userRecord userRecord) {
        try {

            repository.save(userRecord);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String authenticateUser(String username, String password) {
        try {
            userRecord curRecord = repository.findByuserNamePassword(username, password);
            if (curRecord != null) {
                return "200";
            }

            curRecord = repository.findByuserName(username);
            if (curRecord != null) {
                return "300";
            }
            return "400";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return "400";
        }
    }
}
