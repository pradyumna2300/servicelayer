package com.conceptext.servicelayer.service;
import com.conceptext.servicelayer.dto.UserDTO;
import com.conceptext.servicelayer.entity.User;
import com.conceptext.servicelayer.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.convention.MatchingStrategies;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

@Service
public class UserService {
    @Autowired

    private UserRepo repo;

    public String saveUser(User user){
        repo.save(user);
        return "user register";


    }
    public List<User> getallUsers(){
        return repo.findAll();


    }
    public List<UserDTO> getAllUsers(){
        return repo.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }
    private UserDTO convertEntityToDto(User user){
        UserDTO userDTO=new UserDTO();
        userDTO.setUserId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setMobile(user.getMobile());
        userDTO.setAddress(user.getAddress());
        return userDTO;

    }


}
