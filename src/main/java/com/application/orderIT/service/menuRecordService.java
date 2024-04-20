package com.application.orderIT.service;

import com.application.orderIT.entity.menuRecord;
import com.application.orderIT.repository.menuRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class menuRecordService {

    private final menuRecordRepository repository;

    @Autowired
    public menuRecordService(menuRecordRepository repository) {
        this.repository = repository;
    }

    public List<menuRecord> getAllmenu() {
        return repository.findAll();
    }

    public boolean addMenu(menuRecord menuRecord) {

        try
        {
            repository.save(menuRecord);
            return true;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
