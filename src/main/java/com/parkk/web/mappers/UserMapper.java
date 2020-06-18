package com.parkk.web.mappers;

import com.parkk.web.User.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public void insertMapper(UserDTO user);
}
