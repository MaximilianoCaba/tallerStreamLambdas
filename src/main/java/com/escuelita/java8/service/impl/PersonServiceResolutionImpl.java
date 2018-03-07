package com.escuelita.java8.service.impl;

import com.escuelita.java8.constants.Constants;
import com.escuelita.java8.entity.Person;
import com.escuelita.java8.repository.PersonRepository;
import com.escuelita.java8.service.PersonServiceResolution;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PersonServiceResolutionImpl implements PersonServiceResolution {

    @Override
    public List<Person> getAllGenderMale() {
        return this.getAllPerson().stream()
                .filter(p -> p.getGender().equals(Constants.GENDER_MALE))
                .collect(Collectors.toList());
    }

    @Override
    public int getAverageAllAge() {
        List<Person> personList = this.getAllPerson();
        return personList.stream()
                .map(Person::getAge)
                .reduce(0,(a, b) -> a+b) / personList.size();
    }

    @Override
    public List<Person> getAllPersonInNewWorkingPosition(){
        return this.getAllPerson().stream()
                .map(p -> this.getPersonInNewPosition(p.getId()))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, Person> getAllPersonMapped() {
        return this.getAllPerson().stream()
                .collect(Collectors.toMap(Person::getId, Function.identity()));
    }

    @Override
    public List<Person> getPersonsPromoteProgrammer(){
        return this.getAllPersonInNewPosition().stream()
                .filter(p -> p.getOccupation().equals(Constants.OCCUPATION_PROGRAMMER))
                .map(this::ascenderProgramador)
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getAllpersonSortByAge(){
        return this.getAllPersonInNewPosition().stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
    }

    private Person ascenderProgramador(Person person){
        person.setOccupation(Constants.OCCUPATION_SUPER_PROGRAMMER);
        return person;
    }

    private List<Person> getAllPerson(){
        return PersonRepository.getAll();
    }

    private Person getPersonInNewPosition(int idPerson){
        return PersonRepository.getPersonInNewPosition(idPerson);
    }

    private List<Person> getAllPersonInNewPosition(){
        return PersonRepository.getAllpersonInNewPosition();
    }

}
