package com.lava.lava.repository;

import com.lava.lava.entity.Deduction;
import com.lava.lava.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeductionRepo extends JpaRepository<Deduction, Long> {

    List<Deduction> findByEmployee(Employee employee);

}
