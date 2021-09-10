package com.harrybro.hellomapstruct.basic.dto;

import com.harrybro.hellomapstruct.basic.domain.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "team", target = "group")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    Person toEntity(PersonDto personDto);

    @Mapping(source = "group", target = "team")
    PersonDto toDto(Person person);
}
