package com.harrybro.hellomapstruct.basic.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;
    private String name;
    private String email;
    private String group;
    private LocalDateTime createdAt;

}
