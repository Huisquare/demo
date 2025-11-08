package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{

    private Map<String, User> storageMap;

    @PostConstruct
    private void init() {
        storageMap = new HashMap<>();
    }

    @Override
    public void save(User user) {

        String email = user.getEmail();

        storageMap.put(email, user);

        System.out.println("saving User: " + user);
    }

    @Override
    public User findByEmail(String email){
        return storageMap.get(email);
    }
}
