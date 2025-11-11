package com.lava.lava.repository;

import com.lava.lava.entity.Employee;
import com.lava.lava.entity.SalaryStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryStructureRepo extends JpaRepository<SalaryStructure,Long> {

    List<SalaryStructure> findByCompanyId(Long companyId);

    List<SalaryStructure> findByEmployee(Employee Employee);

}
