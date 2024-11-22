package com.jyhun.ExamReservation.domain.user.dto;

import com.jyhun.ExamReservation.domain.user.constant.Role;
import com.jyhun.ExamReservation.domain.user.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDTO {

    private String name;

    private String email;

    private String password;

    public User toEntity(User user) {
        return new User(name, email, password, Role.USER);
    }

}
