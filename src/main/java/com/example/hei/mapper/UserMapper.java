package com.example.hei.mapper;

import com.example.hei.dto.UserRegisterDto;
import com.example.hei.dto.UserResponseDto;
import com.example.hei.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserRegisterDto userRegisterDto);

    UserResponseDto map(User user);

}
