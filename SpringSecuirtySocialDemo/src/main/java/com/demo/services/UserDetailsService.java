package com.demo.services;

import com.demo.model.UserProfile;
import com.demo.repo.UserRepository;
import com.demo.repo.UserSocialConnectionRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by GeetaKrishna on 1/9/2016.
 */

@Service
@Data
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

    @Autowired
    private UserRepository userService;

    @Autowired
    UserSocialConnectionRepository userSocialConnectionRepository;

    @Override
    public final UserProfile loadUserByUsername(String username) throws UsernameNotFoundException {
        UserProfile user = userService.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException("Not Exist User");
        }

        return user;
    }
}
