package com.example.testtset.Services.Implimentation;

import com.example.testtset.Entities.User;
import com.example.testtset.Repository.Implimentation.UserRepoImp;
import com.example.testtset.Services.UserService;


public class UserServiceImp implements UserService {
    UserRepoImp userRepo = new UserRepoImp();
    @Override
    public User add(User user) {
        return userRepo.add(user);
    }
}
