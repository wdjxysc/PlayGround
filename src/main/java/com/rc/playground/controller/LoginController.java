package com.rc.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangdijun
 * @Title LoginController
 * @ProjectName playground
 * @Description TODO
 * @date 2018/9/26 16:05
 */
@Controller
public class LoginController {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
}
