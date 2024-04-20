package com.application.orderIT.repository;

import com.application.orderIT.entity.restaurantRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restaurantRecordRepository extends JpaRepository<restaurantRecord, Long> {
}
