package org.luminary.controller;

import org.luminary.pojo.User;
import org.luminary.service.UserService;
import org.luminary.util.IWdzlJSONResult;
import org.luminary.util.MD5Utils;
import org.luminary.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制层
 *
 * @author programmerYuan
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 注入用户服务层接口
     */
    @Autowired
    private UserService userService;

    /**
     * 根据用户id获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/getUser")
    public String getUserById(String id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user_list";
    }

    /**
     * 用户登录与注册一体化方法
     *
     * @param user
     * @return
     */
    @PostMapping("/registerOrLogin")
    @ResponseBody
    public IWdzlJSONResult registerOrLogin(User user) {
        // 定义前端加密后的密码
        String pwd = MD5Utils.getPwd(user.getPassword());
        User userResult = userService.getUserByUsername(user.getUsername());
        if (userResult != null) {
            // 此用户存在,可登录
            if (!userResult.getPassword().equals(pwd)) {
                // 前端传递过来的密码与数据库中的中密码不一致 响应密码错误
                return IWdzlJSONResult.errorMsg("密码不正确");
            }
        } else {
            //此用户存在,需要注册
            user.setNickname("王文");
            user.setQrcode("123");
            user.setPassword(pwd);
            user.setFaceImage("123");
            user.setFaceImageBig("123");

            userResult = userService.insert(user);
        }

        UserVo userVo = new UserVo();
        // 将对象中的数据拷贝到另一个对象中
        if (userResult != null) {
            BeanUtils.copyProperties(userResult, userVo);
        }

        return IWdzlJSONResult.ok(userVo);
    }
}
