package com.llt.v1.service;

import com.llt.v1.dto.UserDTO;
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

    //유저 생성
    public UserEntity createUser(UserDTO dto) {

        UserEntity entity = new UserEntity();

        entity.setIdx(dto.getIdx());
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setGender(dto.getGender());
        entity.setAge(dto.getAge());

        return repository.save(entity);
    }

    //전체 유저 조회
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

}
