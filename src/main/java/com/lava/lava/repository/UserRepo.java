package com.lava.lava.repository;

import com.lava.lava.entity.User;
import com.lava.lava.enums.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    //find by email optional using avoid the nullpoint errors
    Optional<User> findByEmail(String email);
    //find by status
    List<User> findByStatus(UserStatus status);
    //find by company id
    List<User> findByCompanyId(Long companyId);
    //find by roleid
    List<User> findByRoleId(Long roleId);

}
