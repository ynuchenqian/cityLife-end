package com.chenqian.cityLifeend.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:chenqian
 * @Description:
 * @Date: created in 14:39 2017/11/5
 */

public interface UserJpaDao extends JpaRepository<User, Long> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the user
     */
    User findByName(String name);


}