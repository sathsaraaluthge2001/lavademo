package com.lava.lava.repository;

import com.lava.lava.entity.Earning;
import com.lava.lava.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EarningRepo extends JpaRepository<Earning, Long> {
    //find By EmployeeId
    List<Earning> findByEmployeeId(Employee employee);
}
