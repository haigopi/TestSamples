package com.demo.services;

import com.demo.model.MongoConnection;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionData;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.security.SocialAuthenticationToken;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

import java.io.Serializable;


public class SimpleSocialUsersDetailService implements SocialUserDetailsService, Serializable {

    private UserDetailsService userDetailsService;

    public SimpleSocialUsersDetailService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException, DataAccessException {
        UserDetails userDetails = userDetailsService.loadUserByUsername(userId);

        //public SocialAuthenticationToken(final Connection<?> connection, final Serializable details, final Map<String, String> providerAccountData, final Collection<? extends GrantedAuthority> authorities) {



      //  MongoConnection con = userDetailsService.userSocialConnectionRepository.findOne(userId);

        //SecurityContextHolder.getContext().setAuthentication(authentication);

        return new SocialUser(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
    }


}