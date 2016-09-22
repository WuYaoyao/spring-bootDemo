package com.example.repository;


import com.example.domain.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wuyaoyao on 16/9/22.
 */
public interface HelloWorldRepository extends JpaRepository<HelloWorld, Long> {
}
