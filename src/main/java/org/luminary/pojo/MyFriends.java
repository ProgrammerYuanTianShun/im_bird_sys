package org.luminary.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName my_friends
 */
@Data
public class MyFriends implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 用户id
     */
    private String myUserId;

    /**
     * 用户的好友id
     */
    private String myFriendUserId;

    private static final long serialVersionUID = 1L;
}