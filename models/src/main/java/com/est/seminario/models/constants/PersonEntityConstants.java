package com.est.seminario.models.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonEntityConstants {
    public static final String TABLE_NAME = "PERSON";

    public static final String PRIMARY_KEY_COLUMN_NAME = "id";
    public static final String NAME_COLUMN_NAME = "name";
    public static final String EMAIL_COLUMN_NAME = "email";
}
