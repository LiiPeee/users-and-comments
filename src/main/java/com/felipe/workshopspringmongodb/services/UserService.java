package com.felipe.workshopspringmongodb.services;

import com.felipe.workshopspringmongodb.domain.User;
import com.felipe.workshopspringmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public List<User> save(List<User> user) {
        return repo.saveAll(user);

    }


}
