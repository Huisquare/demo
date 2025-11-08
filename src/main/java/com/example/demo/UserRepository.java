package com.example.demo;

public interface UserRepository {

    public void save(User user);

    public User findByEmail(String email);
}
