package com.harrybro.hellomapstruct.basic.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private Long id;
    private String name;
    private String email;
    private String team;

}
