package com.harrybro.hellomapstruct.basic.dto;

import lombok.*;

@Getter // MapStruct를 사용하는데 Getter와 Setter는 없어도 된다.
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
