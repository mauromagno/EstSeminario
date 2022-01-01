package com.est.seminario.services;

import com.est.seminario.mappers.PersonMapper;
import com.est.seminario.models.entities.PersonEntity;
import com.est.seminario.models.request.PersonDTO;
import com.est.seminario.models.response.PersonInfoOutput;
import com.est.seminario.repositories.PersonRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.util.List;

@Service
public class DefaultPersonService implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @SneakyThrows
    @Override
    public PersonInfoOutput getPersonById(String id) {
        try {
            PersonEntity p = personRepository.getById(Integer.parseInt(id));
            return PersonMapper.mapPersonById(p);
        } catch (Exception e) {
            throw new ValidationException(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public PersonInfoOutput createPerson(PersonDTO personInput) {
        try {
            PersonEntity p = PersonMapper.createPersonInput(personInput);
            personRepository.save(p);

            List<PersonEntity> allRecords = personRepository.findAll();
            PersonEntity lastElementInserted =  allRecords.stream().skip(allRecords.size() - 1).findFirst().get();
            return PersonMapper.mapPersonById(lastElementInserted);
        } catch (Exception e) {
            throw new ValidationException(e.getMessage());
        }
    }
}
