package com.harrybro.hellomapstruct.basic.dto;

import com.harrybro.hellomapstruct.basic.domain.Message;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MessageMapper {

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    @Mapping(target = "statusMessage", expression = "java(\"Status Message: \" + sendMessageDto.getStatusMessage())")
    Message toMessage(SendMessageDto sendMessageDto);

}
