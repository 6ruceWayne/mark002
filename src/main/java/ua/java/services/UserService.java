package ua.java.services;

import ua.java.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
