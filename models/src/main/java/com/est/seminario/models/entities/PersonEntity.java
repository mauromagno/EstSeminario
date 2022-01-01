package com.est.seminario.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.est.seminario.models.constants.PersonEntityConstants.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = TABLE_NAME)
public class PersonEntity {

    @Id
    @Generated
    @Column(name = PRIMARY_KEY_COLUMN_NAME)
    private int id;

    @Column(name = NAME_COLUMN_NAME)
    private String name;

    @Column(name = EMAIL_COLUMN_NAME)
    private String email;
}
