package com.lava.lava.repository;

import com.lava.lava.entity.Company;
import com.lava.lava.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DesignationRepo extends JpaRepository<Designation,Long> {

    List<Designation> findByCompany(Company  company);

}
