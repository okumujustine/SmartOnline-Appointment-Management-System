package com.justine.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    private Integer id;
    private String name;
    private String email;
    private int age;
    private String password;
    private String phoneNumber;
}
