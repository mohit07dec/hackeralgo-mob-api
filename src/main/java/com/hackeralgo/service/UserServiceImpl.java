package com.hackeralgo.service;

import com.hackeralgo.entity.User;
import com.hackeralgo.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User signUp(User user) {
        // Implementation
        // For now, we'll return the user as-is
        return user;
    }

    @Override
    public User getUserByMobileNumber(Long mobileNumber) {
        // Implementation
        // For now, we'll return null
        return null;
    }

    @Override
    public User convertToUser(UserDTO userDTO) {
        User user = new User();
        user.setEmailId(userDTO.getEmailId());
        user.setMobileNum(userDTO.getMobileNum());
        user.setFirstNm(userDTO.getFirstNm());
        user.setLastNm(userDTO.getLastNm());
        user.setProfileDetails(userDTO.getProfileDetails());
        user.setCountry(userDTO.getCountry());
        return user;
    }
}
