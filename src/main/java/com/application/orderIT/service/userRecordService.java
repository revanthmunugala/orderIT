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
}
