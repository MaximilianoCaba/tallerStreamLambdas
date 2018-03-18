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
                .reduce(0, (a, b) -> a + b) / personList.size();
    }

    @Override
    public List<Person> getAllPersonInNewWorkingPosition() {
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
    public List<Person> getPersonsPromoteProgrammer() {
        return this.getAllPersonInNewPosition().stream()
                .filter(p -> p.getOccupation().equals(Constants.OCCUPATION_PROGRAMMER))
                .map(Person::ascenderProgramador)
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getAllpersonSortByAge() {
        return this.getAllPersonInNewPosition().stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
    }

    @Override
    public Person findAnyByName(String personName) {
        return this.getAllPersonInNewPosition().stream()
                .filter(person -> person.getName().equals(personName))
                .findAny()
                .orElse(null);
    }

    @Override
    public List<Person> getPersonInTheMiddleList(List<Person> listPersons) {
        int[] cut = getListCut(listPersons.size());
        return listPersons.stream()
                .skip(cut[0])
                .limit(cut[1])
                .collect(Collectors.toList());
    }


    private List<Person> getAllPerson() {
        return PersonRepository.getAll();
    }

    private Person getPersonInNewPosition(int idPerson) {
        return PersonRepository.getPersonInNewPosition(idPerson);
    }

    private List<Person> getAllPersonInNewPosition() {
        return PersonRepository.getAllpersonInNewPosition();
    }

    public static List<Person> getAllPersonPar() {
        return PersonRepository.getAll();

    }

    public static List<Person> getAllPersonImpar() {
        List<Person> personList = PersonRepository.getAll();
        personList.remove(19);
        return personList;
    }

    private int[] getListCut(int sizeList) {
        int firstCut;
        int secondCut = 1;
        if ((sizeList % 2) == 0) {
            firstCut = (sizeList - 1) / 2;
            secondCut = 2;
        } else
            firstCut = sizeList / 2;

        return new int[]{firstCut, secondCut};
    }
}
