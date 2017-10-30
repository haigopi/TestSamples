package com.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.social.connect.web.ConnectInterceptor;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by GeetaKrishna on 1/22/2016.
 */
@Slf4j
public class FBIntercepptor implements ConnectInterceptor<Facebook> {



        public void postConnect(Connection connection, WebRequest request) {
            connection.updateStatus("I've connected with the Spring Social Showcase!");
            log.info("==========CONNEC TED ==========");

            //Set the Secuirty Context -- STill might cleared

        }


    @Override
    public void preConnect(ConnectionFactory<Facebook> connectionFactory, MultiValueMap<String, String> parameters, WebRequest request) {
        log.info("Nothing To do");
    }
}
