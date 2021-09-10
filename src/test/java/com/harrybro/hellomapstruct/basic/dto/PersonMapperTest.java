package com.harrybro.hellomapstruct.basic.dto;

import com.harrybro.hellomapstruct.basic.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class PersonMapperTest {

    Logger log = LoggerFactory.getLogger(PersonMapperTest.class);

    @Test
    @DisplayName("person entity to dto")
    void personEntityToDto() {
        PersonDto personDto = new PersonDto(1L, "person1", "test@test.com", "teamA");
        Person person = PersonMapper.INSTANCE.toEntity(personDto);
        log.info(person.toString());
        Assertions.assertEquals(person.getName(), personDto.getName());
    }

    @Test
    @DisplayName("person dto to entity")
    void personDtoToEntity() {
        Person person = new Person(1L, "person1", "test@test.com", "teamA", LocalDateTime.now());
        PersonDto personDto = PersonMapper.INSTANCE.toDto(person);
        log.info(personDto.toString());
        Assertions.assertEquals(personDto.getId(), person.getId());
    }

}