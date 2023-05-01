package com.example.hei.mapper;

import com.example.hei.dto.HEIResponseDto;
import com.example.hei.entity.HEI;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HEIMapper {

    List<HEIResponseDto> map(List<HEI> heis);

}
