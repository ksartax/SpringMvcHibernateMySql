package spring.dao;

import spring.model.User;

import java.util.List;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */
public interface UserDao {

    List<User> findAllUser();

}
