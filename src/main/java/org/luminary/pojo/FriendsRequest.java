package org.luminary.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName friends_request
 */
@Data
public class FriendsRequest implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String sendUserId;

    /**
     * 
     */
    private String acceptUserId;

    /**
     * 发送请求的事件
     */
    private Date requestDateTime;

    private static final long serialVersionUID = 1L;
}