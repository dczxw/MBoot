package com.siuper.boot.message.controller;

import com.siuper.boot.message.model.AyUser;
import com.siuper.boot.message.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("user")
public class AyUserController {

    @Resource
    private AyUserService ayUserService;


    @RequestMapping(name = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String userList() {
        List<AyUser> all = ayUserService.findAll();
        return "ssss";
    }
}
