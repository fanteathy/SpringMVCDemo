package com.springapp.mvc.Dao;
import com.springapp.mvc.Model.User;

/**
 * Created by joshua on 16/5/21.
 */
public interface IUserDao {
    public User findUserById(int id); //查询
    public void addUser(User user); //添加
}
