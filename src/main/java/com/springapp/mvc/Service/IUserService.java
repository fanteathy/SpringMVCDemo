package com.springapp.mvc.Service;

import com.springapp.mvc.Model.User;

/**
 * Created by joshua on 16/5/21.
 */
public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);
}
