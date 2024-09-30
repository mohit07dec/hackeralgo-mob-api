package com.hackeralgo.service;

import com.hackeralgo.entity.User;
import com.hackeralgo.dto.UserDTO;
import org.springframework.stereotype.Service;

public interface UserService {
    User signUp(User user);
    User getUserByMobileNumber(Long mobileNumber);
    User convertToUser(UserDTO userDTO);
}
