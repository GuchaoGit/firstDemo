package com.guc.firstdemo.service;

import com.guc.firstdemo.entity.User;
import com.guc.firstdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUserName(String name){
        User user = null;
        try{
            user = userRepository.findByUserName(name);
        }catch (Exception e){}
        return user;
    }

    public boolean addUser(String name,String password,String age){
        User user = new User();
        user.setName(name);
        try{
            user.setAge(age==null?0:Integer.parseInt(age));
        }catch (NumberFormatException e){
        }
        user.setPassword(password);
        User save = userRepository.save(user);
        return save!=null;
    }
}
