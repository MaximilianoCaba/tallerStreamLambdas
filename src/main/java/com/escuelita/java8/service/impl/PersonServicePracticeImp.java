package com.escuelita.java8.service.impl;

import com.escuelita.java8.entity.Person;
import com.escuelita.java8.repository.PersonRepository;
import com.escuelita.java8.service.PersonServicePractice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServicePracticeImp implements PersonServicePractice {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllGenderMale() {

        return null;
    }

    @Override
    public int getAverageAllAge() {

        return 0;
    }

    private List<Person> getAllPerson(){
        return personRepository.findAll();
    }
}
