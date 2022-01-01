package com.est.seminario.web;


import com.est.seminario.models.request.PersonDTO;
import com.est.seminario.models.response.PersonInfoOutput;
import com.est.seminario.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/{personId}")
    public ResponseEntity<PersonInfoOutput> getPersonById(@PathVariable(value = "personId") String id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @PutMapping
    public ResponseEntity<PersonInfoOutput> createPerson(@Valid @RequestBody PersonDTO personInput) {
        return ResponseEntity.ok(personService.createPerson(personInput));
    }

}
