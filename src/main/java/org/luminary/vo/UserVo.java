package org.luminary.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName users
 */
@Data
public class UserVo implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户名，账号，慕信号
     */
    private String username;

    /**
     * 我的头像，如果没有默认给一张
     */
    private String faceImage;

    /**
     * 头像完整
     */
    private String faceImageBig;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 新用户注册后默认后台生成二维码，并且上传到fastdfs
     */
    private String qrcode;


    private static final long serialVersionUID = 1L;
}