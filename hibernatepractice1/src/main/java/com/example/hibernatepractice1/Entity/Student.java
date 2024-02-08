package com.example.hibernatepractice1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stdnt")
public class Student {
    @Id
    private int id;
    private String name;
    private String address;
}
