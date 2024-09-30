package com.hackeralgo.repository;

import com.hackeralgo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByMobileNum(Long mobileNum);
}
