package com.example.testtset.Dao.implimentation;

import com.example.testtset.Dao.UserDao;
import com.example.testtset.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDaoImp implements UserDao {

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public User add(User user) {
        System.out.println("yaes");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        System.out.println("no");

            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
            entityManager.close();
            return user;

    }
}
