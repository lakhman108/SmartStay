package com.lucky.smartstay.Service;

import com.lucky.smartstay.Models.User;
import com.lucky.smartstay.Models.UserDto;
import com.lucky.smartstay.Repo.Userrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private Userrepo userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<UserDto> getUsersWithProperties() {
        List<User> users = userRepository.findAll();

        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDto.setEmail(user.getEmail());
            userDto.setPhoneNo(user.getPhoneNo());
            userDto.setRole(user.getRole());
            userDto.setProperties(user.getProperties());
            userDtos.add(userDto);
        }

        return userDtos;
    }
    // Add other user-related methods as needed
}