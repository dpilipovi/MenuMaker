package com.zapresic.menu_maker.dtos;

import com.zapresic.menu_maker.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
}
