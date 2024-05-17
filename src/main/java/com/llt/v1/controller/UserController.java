package com.llt.v1.controller;

import com.llt.v1.dto.UserDTO;
import com.llt.v1.entity.UserEntity;
import com.llt.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserDTO dto) {
        UserEntity entity = service.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

}
