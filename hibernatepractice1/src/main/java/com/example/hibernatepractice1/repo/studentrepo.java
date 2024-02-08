package com.example.hibernatepractice1.repo;

import com.example.hibernatepractice1.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository <Student,Integer>{

}
