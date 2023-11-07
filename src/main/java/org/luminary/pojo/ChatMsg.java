package org.luminary.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author YuanTianShun
 * @TableName chat_msg
 */
@Data
public class ChatMsg implements Serializable {
    /**
     *  主键
     */
    private String id;

    /**
     *  发送用户的id
     */
    private String sendUserId;

    /**
     *  接受用户的id
     */
    private String acceptUserId;

    /**
     *  消息
     */
    private String msg;

    /**
     * 消息是否签收状态
     * 1：签收
     * 0：未签收
     */
    private Integer signFlag;

    /**
     * 发送请求的事件
     */
    private Date createTime;
}