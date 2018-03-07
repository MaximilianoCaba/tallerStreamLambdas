package com.escuelita.java8.repository;

import com.escuelita.java8.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonRepository {


    final private static String CIVIL_STATUS_DIVORCED = "DIVORCIADO";
    final private static String CIVIL_STATUS_MARRIED = "CASADO";
    final private static String CIVIL_STATUS_SINGLE = "SOLTERO";

    final private static String GENDER_FEMALE = "MUJER";
    final private static String GENDER_MALE = "HOMBRE";

    final private static String OCCUPATION_PROGRAMMER = "PROGRAMADOR";
    final private static String OCCUPATION_ANALIST = "ANALISTA";
    final private static String OCCUPATION_PROYECT_MANAGER = "PM";
    final private static String OCCUPATION_DESSING = "DISEÑADOR";

    public static List<Person> getAll() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Roberto", 43, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(2, "Juan", 23, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(3, "Maria", 24, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, null));
        personList.add(new Person(4, "Jose", 53, CIVIL_STATUS_MARRIED, GENDER_MALE, null));
        personList.add(new Person(5, "Pedro", 23, CIVIL_STATUS_SINGLE, GENDER_MALE, null));
        personList.add(new Person(6, "Lucas", 34, CIVIL_STATUS_MARRIED, GENDER_MALE, null));
        personList.add(new Person(7, "Mauro", 22, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(8, "Josefina", 24, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, null));
        personList.add(new Person(9, "Rigoberta", 26, CIVIL_STATUS_MARRIED, GENDER_FEMALE, null));
        personList.add(new Person(10, "Rogelia", 27, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, null));
        personList.add(new Person(11, "Marta", 34, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, null));
        personList.add(new Person(12, "Jaimito", 34, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(13, "Rodolfo", 36, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(14, "Raul", 19, CIVIL_STATUS_SINGLE, GENDER_MALE, null));
        personList.add(new Person(15, "Pepe", 21, CIVIL_STATUS_SINGLE, GENDER_MALE, null));
        personList.add(new Person(16, "Marina", 24, CIVIL_STATUS_SINGLE, GENDER_FEMALE, null));
        personList.add(new Person(17, "Monica", 20, CIVIL_STATUS_SINGLE, GENDER_FEMALE, null));
        personList.add(new Person(18, "Josefino", 43, CIVIL_STATUS_MARRIED, GENDER_MALE, null));
        personList.add(new Person(19, "Francisco", 44, CIVIL_STATUS_DIVORCED, GENDER_MALE, null));
        personList.add(new Person(20, "Federic", 34, CIVIL_STATUS_MARRIED, GENDER_MALE, null));

        return personList;

    }

    public static Person getPersonInNewPosition(int idPerson){

        Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(1, new Person(1, "Roberto", 43, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_PROYECT_MANAGER));
        personMap.put(2, new Person(2, "Juan", 23, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_PROGRAMMER));
        personMap.put(3, new Person(3, "Maria", 24, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, OCCUPATION_DESSING));
        personMap.put(4, new Person(4, "Jose", 53, CIVIL_STATUS_MARRIED, GENDER_MALE, OCCUPATION_PROYECT_MANAGER));
        personMap.put(5, new Person(5, "Pedro", 23, CIVIL_STATUS_SINGLE, GENDER_MALE, OCCUPATION_ANALIST));
        personMap.put(6, new Person(6, "Lucas", 34, CIVIL_STATUS_MARRIED, GENDER_MALE, OCCUPATION_DESSING));
        personMap.put(7, new Person(7, "Mauro", 22, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_PROGRAMMER));
        personMap.put(8, new Person(8, "Josefina", 24, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, OCCUPATION_PROGRAMMER));
        personMap.put(9, new Person(9, "Rigoberta", 26, CIVIL_STATUS_MARRIED, GENDER_FEMALE, OCCUPATION_DESSING));
        personMap.put(10, new Person(10, "Rogelia", 27, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, OCCUPATION_PROGRAMMER));
        personMap.put(11, new Person(11, "Marta", 34, CIVIL_STATUS_DIVORCED, GENDER_FEMALE, OCCUPATION_PROYECT_MANAGER));
        personMap.put(12, new Person(12, "Jaimito", 34, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_ANALIST));
        personMap.put(13, new Person(13, "Rodolfo", 36, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_ANALIST));
        personMap.put(14, new Person(14, "Raul", 19, CIVIL_STATUS_SINGLE, GENDER_MALE, OCCUPATION_PROGRAMMER));
        personMap.put(15, new Person(15, "Pepe", 21, CIVIL_STATUS_SINGLE, GENDER_MALE, OCCUPATION_PROGRAMMER));
        personMap.put(16, new Person(16, "Marina", 24, CIVIL_STATUS_SINGLE, GENDER_FEMALE, OCCUPATION_PROGRAMMER));
        personMap.put(17, new Person(17, "Monica", 20, CIVIL_STATUS_SINGLE, GENDER_FEMALE, OCCUPATION_DESSING));
        personMap.put(18, new Person(18, "Josefino", 43, CIVIL_STATUS_MARRIED, GENDER_MALE, OCCUPATION_ANALIST));
        personMap.put(19, new Person(19, "Francisco", 44, CIVIL_STATUS_DIVORCED, GENDER_MALE, OCCUPATION_ANALIST));
        personMap.put(20, new Person(20, "Federic", 34, CIVIL_STATUS_MARRIED, GENDER_MALE, OCCUPATION_PROGRAMMER));

        return personMap.get(idPerson);
    }

    public static List<Person> getAllpersonInNewPosition(){
        return getAll().stream().map(p -> getPersonInNewPosition(p.getId())).collect(Collectors.toList());
    }


}
