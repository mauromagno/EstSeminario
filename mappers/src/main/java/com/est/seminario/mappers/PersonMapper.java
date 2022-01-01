package com.est.seminario.mappers;

import com.est.seminario.models.entities.PersonEntity;
import com.est.seminario.models.request.PersonDTO;
import com.est.seminario.models.response.PersonInfoOutput;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonMapper {

    public static PersonInfoOutput mapPersonById(PersonEntity p) {
        return PersonInfoOutput.builder()
                .name(p.getName())
                .id(p.getId())
                .email(p.getEmail())
                .build();
    }

    public static PersonEntity createPersonInput(PersonDTO p) {
        return PersonEntity.builder()
                .name(p.getNome())
                .email(p.getEmail())
                .build();
    }
}
