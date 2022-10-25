package com.example.testtset.Repository.Implimentation;

import com.example.testtset.Dao.implimentation.UserDaoImp;
import com.example.testtset.Entities.User;
import com.example.testtset.Repository.UserRepo;


public class UserRepoImp implements UserRepo {
    UserDaoImp userDao = new UserDaoImp();
    @Override
    public User add(User user) {
        return userDao.add(user);
    }
}
