package com.vocabulary.en.learning.service;

import com.vocabulary.en.learning.model.Role;
import com.vocabulary.en.learning.model.User;
import com.vocabulary.en.learning.repository.RoleRepository;
import com.vocabulary.en.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public Optional<User> findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User createUpdate(User user) {
        User toSave = user.getId() ==
                null ? createUser(user) : updateUser(user);
        return userRepository.save(toSave);
    }

    private User createUser(User user) {
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByName("user"));
        user.setRoles(roles);
        user.setPassword(encoder.encode(user.getPassword()));
        return user;
    }

    private User updateUser(User user) {
        User origin = userRepository.findById(user.getId()).get();

        if (!StringUtils.isEmpty(user.getEmail())) {
            origin.setEmail(user.getEmail());
        }

        //TODO: updatePassword

        if (!StringUtils.isEmpty(user.getFirstName())) {
            origin.setFirstName(user.getFirstName());
        }

        if (!StringUtils.isEmpty(user.getLastName())) {
            origin.setLastName(user.getLastName());
        }

        if (!StringUtils.isEmpty(user.getNickName())) {
            origin.setNickName(user.getNickName());
        }

        if (!StringUtils.isEmpty(user.getBirthday())) {
            origin.setBirthday(user.getBirthday());
        }

        if (!StringUtils.isEmpty(user.getPhoto())) {
            origin.setPhoto(user.getPhoto());
        }
        return origin;
    }
}

