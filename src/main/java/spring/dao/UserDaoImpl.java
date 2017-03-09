package spring.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.User;

import java.util.List;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

    @SuppressWarnings("unchecked")
    public List<User> findAllUser() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }
}
