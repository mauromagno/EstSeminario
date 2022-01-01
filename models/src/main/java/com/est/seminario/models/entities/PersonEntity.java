package com.est.seminario.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "PERSON")
public class PersonEntity implements Serializable {

    @Id
    @Generated
    private int id;
    private String name;
    private String email;
}
