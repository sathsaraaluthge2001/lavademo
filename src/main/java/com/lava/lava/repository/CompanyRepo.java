package com.lava.lava.repository;

import com.lava.lava.entity.Company;
import com.lava.lava.enums.CompanyStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

    List<Company> findCompanyStatus(CompanyStatus companyStatus);

    Optional<Company> findByName(String name);
    Optional<Company> findByRegistrationNo(String registrationNo);
    Optional<Company> findByEmail(String email);

}
