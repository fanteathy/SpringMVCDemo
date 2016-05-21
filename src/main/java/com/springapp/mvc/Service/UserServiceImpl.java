package com.springapp.mvc.Service;

import com.springapp.mvc.Dao.IUserDao;
import com.springapp.mvc.Dao.UserDaoImpl;
import com.springapp.mvc.Model.User;

/**
 * Created by joshua on 16/5/21.
 */
public class UserServiceImpl implements IUserService{
    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
}
