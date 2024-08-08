package com.example.homeworkspringannotations;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void saveUser(User user) {
        System.out.println("Saving user: " + user);
    }

    public User getUserById(Long id) {
        System.out.println("Getting user by ID: " + id);
        return null;
    }


    public void deleteUser(Long id) {
        System.out.println("Deleting user with ID: " + id);
    }
}
