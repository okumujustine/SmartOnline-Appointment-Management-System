package com.justine.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Publisher {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
}
