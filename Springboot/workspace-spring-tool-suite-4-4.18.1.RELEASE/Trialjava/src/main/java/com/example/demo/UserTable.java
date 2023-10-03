package com.example.demo;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

    @Entity

    @Table(name = "users")

    public class UserTable {

 

        @Id

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;

        @Column(nullable = false)

        private String firstName;

        @Column(nullable = false)

        private String lastName;

        @Column(nullable = false, unique = true)

        private String email;
        
    }

   