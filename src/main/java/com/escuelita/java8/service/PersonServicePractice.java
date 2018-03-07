package com.escuelita.java8.service;

import com.escuelita.java8.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonServicePractice {

    List<Person> getAllGenderMale();

    int getAverageAllAge();

    List<Person> getAllPersonInNewWorkingPosition();

    Map<Integer,Person> getAllPersonMapped();

    List<Person> getPersonsPromoteProgrammer();

    List<Person> getAllpersonSortByAge();

}
