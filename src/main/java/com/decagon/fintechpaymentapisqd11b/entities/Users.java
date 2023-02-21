package com.decagon.fintechpaymentapisqd11b.entities;

import com.decagon.fintechpaymentapisqd11b.enums.UsersStatus;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Entity
public class Users extends BaseClass{

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Column(unique = true, length = 11)
    @NotNull
    private String BVN;

    @Email
    @Column(unique = true)
    @NotNull
    private String email;

    @Column(length = 11)
    @NotNull
    private String phoneNumber;

    @Column(columnDefinition = "TEXT")
    @Size(min = 8)
    @NotNull
    private String password;

//    @Column(length = 4)
    @NotNull
    private String pin;

    @Enumerated(EnumType.STRING)
    @NotNull
    private UsersStatus usersStatus;


    @OneToOne(mappedBy = "users")
    private Wallet wallet;

    @NotNull
    private String role;


}

