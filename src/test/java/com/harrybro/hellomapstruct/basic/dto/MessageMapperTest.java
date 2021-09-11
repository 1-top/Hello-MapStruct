package com.harrybro.hellomapstruct.basic.dto;

import com.harrybro.hellomapstruct.basic.domain.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

class MessageMapperTest {

    Logger log = LoggerFactory.getLogger(MessageMapperTest.class);

    @Test
    @DisplayName("simple message dto to entity")
    void simpleMessageDtoToEntity() {
        SendMessageDto dto = new SendMessageDto(
                "to@test.com", "hello", "mapstruct", "type", "status message...");
        Message message = MessageMapper.INSTANCE.toMessage(dto);
        log.info(message.toString());
        Assertions.assertEquals(dto.getTo(), message.getTo());
    }

}