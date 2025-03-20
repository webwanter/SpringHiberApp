package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

import java.util.List;

public interface UserDao  {
    void add(User user);

    User get(Long id);

    void delete(Long id);

    void update(Long id,User user);

    List<User> listUsers();
}
