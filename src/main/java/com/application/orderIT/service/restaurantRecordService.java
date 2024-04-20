package com.application.orderIT.service;

import com.application.orderIT.entity.restaurantRecord;
import com.application.orderIT.repository.restaurantRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class restaurantRecordService {

    private final restaurantRecordRepository repository;

    @Autowired
    public restaurantRecordService(restaurantRecordRepository repository) {
        this.repository = repository;
    }

    public List<restaurantRecord> getAllRestaurants() {
        return repository.findAll();
    }

    public boolean addRestaurant(restaurantRecord restaurantRecord) {
        try {
            repository.save(restaurantRecord);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
