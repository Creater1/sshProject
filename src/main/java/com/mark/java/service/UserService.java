package com.mark.java.service;

import com.mark.java.entity.User;

import java.util.List;

public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
    /*
    * 添加用户
    * */
    public void addUser(User user);
}