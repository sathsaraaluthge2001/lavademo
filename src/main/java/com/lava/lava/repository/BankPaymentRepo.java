package com.lava.lava.repository;

import com.lava.lava.entity.BankPayment;
import com.lava.lava.entity.Payroll;
import com.lava.lava.enums.PaidStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BankPaymentRepo extends JpaRepository<BankPayment,Long> {

    List<BankPayment> findByPayroll(Payroll payroll);

    List<BankPayment> findByPaidStatus(PaidStatus paidStatus);
}
