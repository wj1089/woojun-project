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
        String answer = "";
        if (UserRepository.findByUserId(user.getUserId()) != null){
            answer = "Please try again(Duplicated ID)";
        } else {
            user.setUserId(user.userId);
            user.setNameF(user.nameF);
            user.setNameL(user.nameL);
            user.setUserPw(user.userPw);
            user.setAddress(user.address);
            user.setEmail(user.email);
        }
        return answer;
    }
//                                   ) {


    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody String total, String userId, String UserPw) {
        System.out.println("");
        System.out.println("들어옴");
        System.out.println("total :" +total);
        System.out.println("id : "+userId);
        System.out.println("password : "+UserPw);
        Map<String,Object> map = new HashMap<>();
        try {
//            System.out.println("id값 : "+memberRepository.findById(id).getId());
//            System.out.println("passwd값 : "+memberRepository.findByPassword(password).getPassword());
            if(userRepository.findByUserId(userId).getUserId() != null &&
                    userRepository.findByUserPw(UserPw).getUserPw() != null){
                System.out.println("로그인 성공");
                map.put("result", true);
                user = userRepository.findByUserId(userId);
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

