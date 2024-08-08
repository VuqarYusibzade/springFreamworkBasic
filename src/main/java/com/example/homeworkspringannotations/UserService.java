package com.example.homeworkspringannotations;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void registerUser(User user) {
        System.out.println("Registering user: " + user.getUsername());
    }

    public void deleteUser(Long userId) {
        System.out.println("Deleting user with ID: " + userId);

    }

    public void updateUser(User user) {
        System.out.println("Updating user: " + user.getUsername());

    }
}
