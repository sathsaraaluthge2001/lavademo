package com.lava.lava.repository;

import com.lava.lava.entity.Company;
import com.lava.lava.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

    List<Department> findByCompany(Company company);

    Optional<Department> findByName(String name);
}
