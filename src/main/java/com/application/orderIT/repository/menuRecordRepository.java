package com.application.orderIT.repository;

import com.application.orderIT.entity.menuRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface menuRecordRepository extends JpaRepository<menuRecord, Long> {
}
