package org.example.dao;

import org.example.model.Role;
import org.example.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void add(User user);
    void delete(Long id);
    void edit(User user);
    User getById(Long id);
    User getByUsername(String login);
    Role getRoleByName(String name);
}
