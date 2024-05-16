package com.llt.v1.service;

import com.llt.v1.entity.UserEntity;
import com.llt.v1.repository.UserRepository;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //전체 유저 조회
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

}
