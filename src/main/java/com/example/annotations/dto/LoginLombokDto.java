package com.example.annotations.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginLombokDto {
    public static final String ANNOTATIONS = " [ANNOTATIONS:  " +
                                                    "@Getter, @NoArgsConstructor, @Setter, @ToString" +
                                                "]";

    private String username;
    private String password;
}
