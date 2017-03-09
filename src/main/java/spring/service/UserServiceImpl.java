package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.UserDao;
import spring.model.User;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    @Override
    public List<User> findAllUsers() {
        return dao.findAllUser();
    }
}
