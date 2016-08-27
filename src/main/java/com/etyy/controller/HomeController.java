package com.etyy.controller;

import com.etyy.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(Model model) {
        Msg msg = new Msg("这里是标题", "登录成功", "这是管理员登录");
        model.addAttribute("msg", msg);
        return "home";
    }
}
