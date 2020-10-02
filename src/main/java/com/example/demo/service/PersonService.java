package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return (List<Person>) personRepository.findAll();
    }

    public Person create(Person person){
        return personRepository.save(person);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person update(Person person){
        return personRepository.save(person);
    }
    public void delete(Long id){
        personRepository.deleteById(id);
    }


}
