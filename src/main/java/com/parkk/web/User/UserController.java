package com.parkk.web.User;

import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired User user;
    @Autowired UserRepository userRepository;

    static Logger logger = LoggerFactory.getLogger(UserRepository.class);

    @PostMapping("/join")
    public String join(@RequestBody User user) {
        System.out.println(user.toString());
        String response = "";
        System.out.println("hello");
        if (userRepository.findByUserId(user.getUserId()) != null){
            response = "Please try again";
        } else {
            user.setUserId(user.userId);
            user.setUserPw(user.userPw);
            user.setNameF(user.nameF);
            user.setNameL(user.nameL);
            user.setAddress(user.address);
            user.setEmail(user.email);

            userRepository.save(user);
            response = "Welcome!!";
        }
        return response;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody User user) {
        System.out.println("");
        System.out.println("들어옴");

        System.out.println("id : "+user.getUserId());
        System.out.println("password : "+user.getUserPw());
        Map<String,Object> map = new HashMap<>();
        try {
//            System.out.println("id값 : "+memberRepository.findById(id).getId());
//            System.out.println("passwd값 : "+memberRepository.findByPassword(password).getPassword());
            if(userRepository.findByUserId(user.getUserId()).getUserId() != null &&
                    userRepository.findByUserPw(user.getUserPw()).getUserPw() != null){
                System.out.println("로그인 성공");
                map.put("result", true);
                user = userRepository.findByUserId(user.getUserId());
                System.out.println(user.toString());
                map.put("user",user);
            }
        }catch(Exception e){
            System.out.println("로그인 실패");
            map.put("result", false);
        }
        return map;
    }
    }

