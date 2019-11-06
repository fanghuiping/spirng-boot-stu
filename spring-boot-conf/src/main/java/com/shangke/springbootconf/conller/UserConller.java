package com.shangke.springbootconf.conller;


import com.shangke.springbootconf.confing.Persion;
import com.shangke.springbootconf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConller {
    @Autowired
    User user;
    @Autowired
    Persion persion;
    @GetMapping("user")
    public User User(){
        return user;
    }
    @GetMapping(value = "per")
    public Persion per(){
        return persion;
    }



}
