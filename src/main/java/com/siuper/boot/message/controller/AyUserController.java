package com.siuper.boot.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.Authenticator;

@Controller
@RequestMapping("/user")
public class AyUserController {

    @RequestMapping(name = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String userList() {

        return "ssss";
    }
}
