package com.example.Testdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Testdb.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
