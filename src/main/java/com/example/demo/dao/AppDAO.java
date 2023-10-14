package com.example.demo.dao;

import com.example.demo.entity.Instructor;

public interface AppDAO {
    void save(Instructor instructor);

    Instructor findById(int id);

    void deleteById(int id);
}
