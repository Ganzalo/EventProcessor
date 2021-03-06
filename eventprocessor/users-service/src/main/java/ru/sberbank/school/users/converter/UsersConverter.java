package ru.sberbank.school.users.converter;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import ru.sberbank.school.feign.model.UserModel;
import ru.sberbank.school.users.entity.User;

import java.util.Collections;

@Component
public class UsersConverter {

    public UserModel convertToModel(@NonNull User user) {
        return UserModel.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .password(user.getPassword())
                .roles(Collections.singletonList(user.getRole()))
                .build();
    }

    public User convertToEntity(@NonNull UserModel user) {

        return User.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .password(user.getPassword())
                .role(user.getRoles().get(0))
                .build();

    }
}