package htwberlin.socialnetwork.mini.social.network.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class UserController {

    @Autowired
    UserService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return service.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        logger.info("GET request on route things with {}", id);
        Long userId = Long.parseLong(id);
        return service.get(userId);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.getAll();
    }

}
