package com.lava.lava.repository;

import com.lava.lava.entity.Role;
import com.lava.lava.entity.User;
import com.lava.lava.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    //find by role name
    List<Role> findByName(RoleName name);

}
