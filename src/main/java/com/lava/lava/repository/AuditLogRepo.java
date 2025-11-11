package com.lava.lava.repository;

import com.lava.lava.entity.AuditLog;
import com.lava.lava.entity.Company;
import com.lava.lava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditLogRepo extends JpaRepository<AuditLog, Long> {

    // Find all logs for a specific user
    List<AuditLog> findByUser(User user);

    // Find all logs for a specific company
    List<AuditLog> findByCompany(Company company);

    // Optional: Find logs for a specific user in a specific company
    List<AuditLog> findByUserAndCompany(User user, Company company);
}



