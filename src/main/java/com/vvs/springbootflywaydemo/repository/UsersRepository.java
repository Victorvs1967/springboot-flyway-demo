package com.vvs.springbootflywaydemo.repository;

import com.vvs.springbootflywaydemo.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
