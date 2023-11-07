package org.luminary.service.impl;

import org.luminary.mapper.UserMapper;
import org.luminary.pojo.User;
import org.luminary.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author programmerYuan
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 注入用户持久层接口
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 注入主键生成器
     */
    @Autowired
    private Sid sid;

    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    /**
     * 根据用户名查找用户信息
     *
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    /**
     * 插入用户信息
     *
     * @param user
     * @return
     */
    @Override
    public User insert(User user) {
        // 调用主键生成器中的方法给用户对象中的主键id赋值
        user.setId(sid.nextShort());
        // 调用用户持久层接口插入用户数据
        userMapper.insert(user);
        return user;
    }
}
