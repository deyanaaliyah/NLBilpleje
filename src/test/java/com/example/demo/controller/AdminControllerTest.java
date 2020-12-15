package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {

    Admin admin;
    AdminRepository adminRepository;

    @BeforeEach
    void setUp() {
        admin = adminRepository.read(admin.getUsername(), admin.getPassword());
    }

    @Test
    void loginIndex() {
    }

    @Test
    void loginCheck() {
        assertEquals("yes","isLogIn");
    }

    @Test
    void logout() {
    }
}