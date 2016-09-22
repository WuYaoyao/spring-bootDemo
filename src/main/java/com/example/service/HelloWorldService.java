package com.example.service;

import com.example.domain.HelloWorld;
import com.example.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuyaoyao on 16/9/22.
 */
@Service
public class HelloWorldService {

    @Autowired
    HelloWorldRepository repo;

    public List<HelloWorld> helloWorld() {
        return repo.findAll();
    }

    public void save(HelloWorld helloWorld){
        repo.save(helloWorld);
    }
}
