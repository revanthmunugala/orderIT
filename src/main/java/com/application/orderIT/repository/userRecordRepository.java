package com.application.orderIT.repository;

import com.application.orderIT.entity.userRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRecordRepository  extends JpaRepository<userRecord,Long> {
}
