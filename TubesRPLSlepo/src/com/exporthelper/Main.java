package com.exporthelper;

import com.exporthelper.model.User;
import com.exporthelper.service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Export Helper for Beginners!");

        UserService userService = new UserService();

        // Contoh penggunaan UserService
        User user = new User("username", "email@example.com", "password");
        if (userService.registerUser(user)) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("User registration failed.");
        }
    }
}
