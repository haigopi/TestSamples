package com.demo.services;

import com.demo.dao.UsersDao;
import com.demo.model.UserProfile;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionData;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.security.SocialAuthenticationProvider;
import org.springframework.social.security.SocialAuthenticationToken;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

@Slf4j
@Component
public class AccountConnectionSignUpService implements ConnectionSignUp {

    private final UsersDao usersDao;

    @Autowired
    public AccountConnectionSignUpService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Autowired
    SocialUserDetailsService socialUserDetailsService;

    @Override
    public String execute(Connection<?> connection)  {
        ConnectionData data = connection.createData();
        String imgURL = data.getImageUrl()+"?type=large";
        org.springframework.social.connect.UserProfile profile = connection.fetchUserProfile();
        String userId = data.getProviderUserId();
        log.info("Creating user-id: " + userId);
        UserProfile pf = new UserProfile();
        try {
            BeanUtils.copyProperties(pf, profile);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        pf.setUserId(userId);
        pf.setUsername(userId);
        usersDao.createUser(userId, imgURL, pf);
        log.info("Sec Context : {}", SecurityContextHolder.getContext().getAuthentication());
        log.info("User Created");
        return userId;
    }

}