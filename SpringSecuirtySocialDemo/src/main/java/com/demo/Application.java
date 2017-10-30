package com.demo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.google.connect.GoogleConnectionFactory;

/**
 * Created by magnus on 18/08/14.
 */
@ComponentScan(basePackages = "com.demo")
@SpringBootApplication
@Slf4j
@EnableMongoRepositories
@EnableConfigurationProperties
@EnableScheduling
public class Application {

    public static void main(String[] args) throws Exception{

        MongoClient mongoClient = new MongoClient();
        DB db = mongoClient.getDB("test");
        DBCollection myCollection = db.getCollection("UserProfile");
        myCollection.drop();
        myCollection = db.getCollection("connections");
        myCollection.drop();


        SpringApplication.run(Application.class, args);
        SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_GLOBAL);
    }
}
