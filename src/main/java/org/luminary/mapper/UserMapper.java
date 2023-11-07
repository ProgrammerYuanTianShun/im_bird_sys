package org.luminary.mapper;

import org.luminary.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户持久层接口
 *
 * @author YuanTianShun
 * @Entity net.luminary.pojo.User
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据用户获取用户信息
     *
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    Integer insert(User user);
}
