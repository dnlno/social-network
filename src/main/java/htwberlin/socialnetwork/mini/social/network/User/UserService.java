package htwberlin.socialnetwork.mini.social.network.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public User save(User user) {
        return repo.save(user);
    }

    public User get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<User> getAll() {
        Iterable<User> iterator = repo.findAll();
        List<User> users = new ArrayList<User>();
        for (User user : iterator)  users.add(user);
        return users;
    }
}
