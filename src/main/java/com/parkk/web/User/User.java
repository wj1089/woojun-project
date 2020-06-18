package com.parkk.web.User;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity(name = "user")
@ToString
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;

    String nameF, nameL, userId, userPw, address, email;

    @Builder
    public User(String nameF, String nameL, String userId,
                String userPw, String email, String address) {
        this.nameF = nameF;
        this.nameL = nameL;
        this.userId = userId;
        this.userPw = userPw;
        this.address = address;
        this.email = email;

    }
}