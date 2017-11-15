package com.chenqian.cityLifeend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chenqian
 * @Description:
 * @Date: created in 11:55 2017/11/5
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserJpaDao userJpaDao;

    @Override
    public User getUserByName(String username) {
        return userJpaDao.findAll().get(0);
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public Long saveUser(User user) {
        return null;
    }

    @Override
    public Long updateUser(User user) {
        return null;
    }

    @Override
    public Long deleteUser(Long id) {
        return null;
    }
}
