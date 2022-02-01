package com.cloudstorage.multi.storage.controller;

import java.net.URLEncoder;
import java.util.UUID;

import com.cloudstorage.multi.storage.config.Github;
import com.cloudstorage.multi.storage.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
public class initController {

    @Autowired
    Github github;

    @RequestMapping("/")
    public String home() {
        github.getUser();
       return "login";

    }
}
