package com.demo.dao;

import com.demo.model.MongoConnection;
import com.demo.model.UserProfile;
import com.demo.repo.UserRepository;
import com.demo.repo.UserSocialConnectionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.stereotype.Repository;

/**
 * Created by magnus on 18/08/14.
 */
@Repository
@Slf4j
public class UsersDao {

//    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    UserRepository repository;

    @Autowired
    UserRepository uRepository;

    @Autowired
    UserSocialConnectionRepository userSocialConnectionRepository;

//    @Autowired
//    public UsersDao(DataSource dataSource)
//    {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

    public UserProfile getUserProfile(final String userId) {
        log.info("SQL SELECT ON UserProfile: {}", userId);

        return uRepository.findOne(userId);
//
//        cRepository.
//        return jdbcTemplate.queryForObject("select * from UserProfile where userId = ?",
//            new RowMapper<UserProfile>() {
//                public UserProfile mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new UserProfile(
//                    userId,
//                    rs.getString("name"),
//                    rs.getString("firstName"),
//                    rs.getString("lastName"),
//                    rs.getString("email"),
//                    rs.getString("username"));
//                }
//            }, userId);
    }

    public MongoConnection getUserConnection(final String userId, MongoConnection connection) {
        log.info("SQL SELECT ON UserSocialConnection: {}", userId);

        return userSocialConnectionRepository.findByUserId(userId).get(0);

    }

    public void createUser(String userId, String imgURL, UserProfile profile) {
            log.info("SQL INSERT ON users, authorities and userProfile: " + userId + " with profile: " +
                profile.getEmail() + ", " +
                profile.getFirstName() + ", " +
                profile.getLastName() + ", " +
                profile.getName());

        uRepository.save(profile);


        log.info("From DB {}",getUserProfile(userId));
    }
}
