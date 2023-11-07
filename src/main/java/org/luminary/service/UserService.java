package org.luminary.service;

import org.luminary.pojo.User;

/**
 * 用户服务层接口
 *
 * @author programmerYuan
 */
public interface UserService {
    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    User insert(User user);
}
