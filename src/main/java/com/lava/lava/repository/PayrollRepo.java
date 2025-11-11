package com.lava.lava.repository;

import com.lava.lava.entity.Payroll;
import com.lava.lava.enums.PayrollStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Long> {

    //find by empid
    List<Payroll> findByEmployeeId(Long employeeId);
    //find b companyid
    List<Payroll> findByCompanyId(Long companyId);
    //find by PayrollStatus
    List<Payroll> findByStatus(PayrollStatus payrollStatus);
}
