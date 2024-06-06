package com.paulofreitas.auto_park.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserResponseDto {

    private String id;
    private String username;
    private String profile;
}