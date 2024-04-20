package com.application.orderIT.repository;

import com.application.orderIT.entity.userRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface userRecordRepository  extends JpaRepository<userRecord,Long> {

    @Query("SELECT t FROM userRecord t WHERE t.userName = ?1 and t.password = ?2")
    userRecord findByuserNamePassword(String userName, String password);

    @Query("SELECT t from userRecord t WHERE t.userName  =?1")
    userRecord findByuserName(String username);
}
