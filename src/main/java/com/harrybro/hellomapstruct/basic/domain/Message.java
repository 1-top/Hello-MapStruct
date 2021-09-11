package com.harrybro.hellomapstruct.basic.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Message {

    private String id = UUID.randomUUID().toString();
    private String to;
    private String title;
    private String body;
    private String messageType;
    private String status = "READY";
    private String statusMessage;
    private OffsetDateTime createdAt = OffsetDateTime.now();
    private OffsetDateTime updatedAt = OffsetDateTime.now();

}
