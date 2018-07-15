package com.aliashik.contoller;

import com.aliashik.model.User;
import com.aliashik.service.MongoUserService;
import com.aliashik.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private MongoUserService mongoUserService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User sayHi(){
        return userRepository.save(new User("1", "ali", "test@mail.com", false));
    }
}
