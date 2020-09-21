package com.example.microservice_users_management.service;

import com.example.microservice_users_management.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);
}
