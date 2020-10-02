package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    @GetMapping("/api/v2/users")
    public String showTables(Domain domain) {
        Iterable<Person> elem = personRepository.findAll();
        domain.addAttribute("elem", elem);
        return "index";
    }

    @PutMapping("/api/v2/users")
    public ResponseEntity<?> updatePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }
    @PostMapping("/api/v2/users")
    public ResponseEntity<?> createPerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.create(person));
    }

    @DeleteMapping
    public void deletePerson(@PathVariable Long id){
        personService.delete(id);
    }






    }


