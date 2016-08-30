package cn.rayest.serviceImpl;

import cn.rayest.dao.BaseDao;
import cn.rayest.entity.User;
import cn.rayest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Rayest on 2016/8/30 0030.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private BaseDao<User> baseDao;

    public void saveUser(User user) {
        baseDao.save(user);
    }

    public void updateUser(User user) {
        baseDao.update(user);
    }

    public User findUserById(int id) {
        return baseDao.get(User.class, id);
    }

    public void deleteUser(User user) {
        baseDao.delete(user);
    }

    public List<User> findAllList() {
        return baseDao.find("from User");
    }

    public User findUserByNameAndPassword(User user) {
        return  baseDao.get("from User u where u.userName=? and u.password=?", new Object[]{user.getUserName(), user.getPassword()});
    }
}
