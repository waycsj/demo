package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<엔티티, 프라머리키 데이터 타입>
public interface UserRepository extends JpaRepository<User, Integer> {

}
