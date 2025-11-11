package com.lava.lava.repository;

import com.lava.lava.entity.Company;
import com.lava.lava.entity.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperAdminRepo extends JpaRepository<SuperAdmin,Long> {
    //find using email
    SuperAdmin findByEmail(String email);
    //find using name
    List<SuperAdmin> findByName(String name);

}
