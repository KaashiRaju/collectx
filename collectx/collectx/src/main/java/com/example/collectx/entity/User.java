package com.example.collectx.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_info")
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

    private String name;

    private String email;

    private String password;

    private String roles;

    private String status;


}
