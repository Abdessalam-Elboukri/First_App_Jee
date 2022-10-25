package com.example.testtset.Dao;

import com.example.testtset.Entities.User;

public interface UserDao {
    User find(int id);
    User add(User user);
}
