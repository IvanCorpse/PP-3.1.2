package kata.PP_3_1_2_springbootapp.dao;

import kata.PP_3_1_2_springbootapp.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);

    User getUser(Integer id);

    void removeUser(Integer id);

    void updateUser(User user);
}
