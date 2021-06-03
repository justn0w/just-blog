package com.just.blog.contorller;


import com.just.blog.pojo.User;
import com.just.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author justnow
 * Created on 2021-05-27
 * Description
 */

@Controller
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping({"/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public ModelAndView user(@RequestParam("id") Integer id) {
        ModelAndView mv = new ModelAndView("user");
        User user = userService.queryUserById(id);
        mv.addObject("user", user);
        return mv;
    }

    @GetMapping("/index2")
    public String index2() {
        return "index2";
    }

    @GetMapping("/index3")
    public String index3() {
        return "index3";
    }

}
