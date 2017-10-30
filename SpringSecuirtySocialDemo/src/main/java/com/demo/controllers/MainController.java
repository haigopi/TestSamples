package com.demo.controllers;

import com.demo.controllers.util.SocialControllerUtil;
import com.demo.dao.DataDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by magnus on 18/08/14.
 */
@Controller
@Slf4j
public class MainController {

    //@Autowired
    //private MongoUsersConnectionRepository connectionRepository;

    @Autowired
    private DataDao dataDao;

    @Autowired
    private SocialControllerUtil util;

    @RequestMapping("/")
    public String home(HttpServletRequest request, Principal currentUser, Model model) {
        util.setModel(request, currentUser, model);

        return "home";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Principal currentUser, Model model) {
        util.setModel(request, currentUser, model);
        return "login";
    }

    @RequestMapping(value= "/update", method = POST)
    public String update(
        HttpServletRequest request,
        Principal currentUser,
        Model model,
        @RequestParam(value = "data", required = true) String data) {

        log.info("Update data to: {}", data);
        String userId = currentUser.getName();
        dataDao.setDate(userId, data);

        util.setModel(request, currentUser, model);
        return "home";
    }


}
