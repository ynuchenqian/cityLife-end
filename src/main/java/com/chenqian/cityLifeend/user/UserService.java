package com.chenqian.cityLifeend.user;

import java.util.List;

/**
 * @Author:chenqian
 * @Description:用户业务逻辑接口类
 * @Date: created in 11:03 2017/11/5
 */
public interface  UserService {

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    public User getUserByName(String username);

    /**
     * 获取用户信息列表
     *
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据用户 ID,查询用户信息
     *
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 新增用户信息
     *
     * @param user
     * @return
     */
    Long saveUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    Long updateUser(User user);

    /**
     * 根据用户 ID,删除用户信息
     *
     * @param id
     * @return
     */
    Long deleteUser(Long id);
}
