package com.zapresic.menu_maker.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
@Builder
public class Role implements Serializable {

    @Id
    @SequenceGenerator(name = "role_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "role_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;
    private boolean active;
}
