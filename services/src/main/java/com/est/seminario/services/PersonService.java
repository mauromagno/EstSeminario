package com.est.seminario.services;


import com.est.seminario.models.request.PersonDTO;
import com.est.seminario.models.response.PersonInfoOutput;

public interface PersonService {

    PersonInfoOutput getPersonById(String id);

    PersonInfoOutput createPerson(PersonDTO personInput);

}
