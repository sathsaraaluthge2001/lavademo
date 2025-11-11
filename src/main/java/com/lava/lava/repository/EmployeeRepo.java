package com.lava.lava.repository;

import com.lava.lava.entity.*;
import com.lava.lava.enums.ContractType;
import com.lava.lava.enums.EmployeeStatus;
import com.lava.lava.enums.PayrollStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    //find by employeeeid
    List<Employee> findByCompanyId(Company company);
    //find By departmentId
    List<Employee> findByDepartment(Department department);
    //find By designationId
    List<Employee> findByDesignation(Designation designation);
    //find by employee Status
    List<Employee> findByStatus(EmployeeStatus status);
    //find ContractType
    List<Employee> findByContractType(ContractType contractType);

    Optional<Employee> findByEmpCode(String empCode);
    Optional<Employee> findByNic(String nic);
    Optional<Employee> findByEmail(String email);
}
