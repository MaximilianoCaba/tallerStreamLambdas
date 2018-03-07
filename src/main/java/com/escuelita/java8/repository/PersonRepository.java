package com.escuelita.java8.repository;

import com.escuelita.java8.constants.Constants;
import com.escuelita.java8.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonRepository {




    public static List<Person> getAll() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Roberto", 43, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(2, "Juan", 23, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(3, "Maria", 24, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, null));
        personList.add(new Person(4, "Jose", 53, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, null));
        personList.add(new Person(5, "Pedro", 23, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, null));
        personList.add(new Person(6, "Lucas", 34, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, null));
        personList.add(new Person(7, "Mauro", 22, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(8, "Josefina", 24, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, null));
        personList.add(new Person(9, "Rigoberta", 26, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_FEMALE, null));
        personList.add(new Person(10, "Rogelia", 27, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, null));
        personList.add(new Person(11, "Marta", 34, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, null));
        personList.add(new Person(12, "Jaimito", 34, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(13, "Rodolfo", 36, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(14, "Raul", 19, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, null));
        personList.add(new Person(15, "Pepe", 21, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, null));
        personList.add(new Person(16, "Marina", 24, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_FEMALE, null));
        personList.add(new Person(17, "Monica", 20, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_FEMALE, null));
        personList.add(new Person(18, "Josefino", 43, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, null));
        personList.add(new Person(19, "Francisco", 44, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, null));
        personList.add(new Person(20, "Federic", 34, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, null));

        return personList;

    }

    public static Person getPersonInNewPosition(int idPerson){

        Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(1, new Person(1, "Roberto", 43, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_PROYECT_MANAGER));
        personMap.put(2, new Person(2, "Juan", 23, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(3, new Person(3, "Maria", 24, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE,Constants.OCCUPATION_DESSING));
        personMap.put(4, new Person(4, "Jose", 53, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, Constants.OCCUPATION_PROYECT_MANAGER));
        personMap.put(5, new Person(5, "Pedro", 23, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, Constants.OCCUPATION_ANALIST));
        personMap.put(6, new Person(6, "Lucas", 34, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, Constants.OCCUPATION_DESSING));
        personMap.put(7, new Person(7, "Mauro", 22, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(8, new Person(8, "Josefina", 24, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(9, new Person(9, "Rigoberta", 26, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_FEMALE, Constants.OCCUPATION_DESSING));
        personMap.put(10, new Person(10, "Rogelia", 27, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(11, new Person(11, "Marta", 34, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_FEMALE, Constants.OCCUPATION_PROYECT_MANAGER));
        personMap.put(12, new Person(12, "Jaimito", 34, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_ANALIST));
        personMap.put(13, new Person(13, "Rodolfo", 36, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_ANALIST));
        personMap.put(14, new Person(14, "Raul", 19,Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(15, new Person(15, "Pepe", 21, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_MALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(16, new Person(16, "Marina", 24, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_FEMALE, Constants.OCCUPATION_PROGRAMMER));
        personMap.put(17, new Person(17, "Monica", 20, Constants.CIVIL_STATUS_SINGLE, Constants.GENDER_FEMALE, Constants.OCCUPATION_DESSING));
        personMap.put(18, new Person(18, "Josefino", 43, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, Constants.OCCUPATION_ANALIST));
        personMap.put(19, new Person(19, "Francisco", 44, Constants.CIVIL_STATUS_DIVORCED, Constants.GENDER_MALE, Constants.OCCUPATION_ANALIST));
        personMap.put(20, new Person(20, "Federic", 34, Constants.CIVIL_STATUS_MARRIED, Constants.GENDER_MALE, Constants.OCCUPATION_PROGRAMMER));

        return personMap.get(idPerson);
    }

    public static List<Person> getAllpersonInNewPosition(){
        return getAll().stream().map(p -> getPersonInNewPosition(p.getId())).collect(Collectors.toList());
    }


}
