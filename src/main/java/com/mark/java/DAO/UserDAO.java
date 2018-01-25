package com.mark.java.DAO;

import com.mark.java.entity.User;

import java.util.List;

public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}
