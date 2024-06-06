package com.paulofreitas.auto_park.web.dto.mapper;

import com.paulofreitas.auto_park.entity.User;
import com.paulofreitas.auto_park.web.dto.UserCreateDto;
import com.paulofreitas.auto_park.web.dto.UserResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class UserMapper {

    public static User toUser(UserCreateDto createDto) {
        return new ModelMapper().map(createDto, User.class);
    }

    public static UserResponseDto toDto(User user) {
        String profile = user.getProfile().name().substring("PROFILE_".length());
        PropertyMap<User, UserResponseDto> props = new PropertyMap<User, UserResponseDto>() {
            @Override
            protected void configure() {
                map().setProfile(profile);
            }
        };
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(props);
        return mapper.map(user, UserResponseDto.class);
    }
}