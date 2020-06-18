package com.parkk.web.User;

import com.parkk.web.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserId(String userId);
    User findByUserPw(String userPw);
}

