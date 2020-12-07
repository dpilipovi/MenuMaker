package com.zapresic.menu_maker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_role")
public class UserRole implements Serializable {

    @Id
    @SequenceGenerator(name = "user_role_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_role_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Role role;

    @OneToOne
    private User user;

}