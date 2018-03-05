package com.escuelita.java8.service.impl;

import com.escuelita.java8.entity.Person;
import com.escuelita.java8.repository.PersonRepository;
import com.escuelita.java8.service.PersonServiceResolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceResolutionImpl implements PersonServiceResolution {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllGenderMale() {
        return this.getAllPerson().stream().filter(p -> p.getGender().equals("M")).collect(Collectors.toList());
    }

    @Override
    public int getAverageAllAge() {
        List<Person> personList = this.getAllPerson();
        return personList.stream().map(Person::getAge).reduce(0,(a, b) -> a+b) / personList.size();
    }

    private List<Person> getAllPerson(){
        return personRepository.findAll();
    }
}
