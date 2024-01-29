package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDaoImpl userDaoImpl;
    @Autowired
    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public List<User> findAll() {
        return userDaoImpl.findAll();
    }

    public User findOne(int id) {
        return userDaoImpl.findOne(id);
    }

    public void save(User user) {
        userDaoImpl.save(user);
    }

    public void update(int id, User updatedUser) {
        userDaoImpl.update(id, updatedUser);
    }

    public void delete(int id) {
        userDaoImpl.delete(id);
    }

}
