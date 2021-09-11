package com.harrybro.hellomapstruct.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessageDto {
    private String to;
    private String title;
    private String body;
    private String messageType;
    private String statusMessage;
}
