package com.zey.sm.controller.admin;

import com.zey.sm.model.User;
import com.zey.sm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/getAdmin")
    private String toAdminWeb(){
        return "admin/index";
    }

    @Autowired
    private AdminService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        List<User> user= userService.getAdmin();
        return  user;
    }

}

