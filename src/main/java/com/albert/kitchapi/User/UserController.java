package com.albert.kitchapi.User;

import com.albert.kitchapi.ApiController;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements ApiController {

    @Autowired
    UserService userService;

    @GetMapping("/user/newrandomuser")
    public Long newRandomUser(){
        return userService.newRandomUser();
    }

    @GetMapping("user/randomitemforuser/{userId}")
    public void randomItemForUser(@PathVariable Long userId) throws NotFoundException {
        userService.randomItemForUser(userId);
    }


}
