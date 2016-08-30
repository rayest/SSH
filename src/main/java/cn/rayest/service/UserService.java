package cn.rayest.service;

import cn.rayest.entity.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public void updateUser(User user);

    public User findUserById(int id);

    public void deleteUser(User user);

    public List<User> findAllList();

    public User findUserByNameAndPassword(User user);
}
