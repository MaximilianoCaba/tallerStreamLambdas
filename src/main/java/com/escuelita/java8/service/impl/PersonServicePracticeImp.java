package com.escuelita.java8.service.impl;

import com.escuelita.java8.constants.Constants;
import com.escuelita.java8.entity.Person;
import com.escuelita.java8.repository.PersonRepository;
import com.escuelita.java8.service.PersonServicePractice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonServicePracticeImp implements PersonServicePractice {

    /*
    * Person object
    *
    * id (identificador)
    * name (nombre )
    * age (edad)
    * civilStatus (estado civil) DIVORCIADO/CASADO/SOLTERO
    * gender (genero de la persona) HOMBRE/MUJER
    * occupation (ocupacion profesional) PM/DISEÑADOR/PROGRAMADOR/ANALISTA
     */

    //Todas las constantes se encuentran en com.escuelita.java8.constants.Constants

    @Override
    public List<Person> getAllGenderMale() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()

        return null;
    }

    @Override
    public int getAverageAllAge() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()

        return 0;
    }

    @Override
    public List<Person> getAllPersonInNewWorkingPosition() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()
        //y para obtener informacion de una persona this.getPersonInNewPosition(int idPerson)

        return null;
    }

    @Override
    public Map<Integer, Person> getAllPersonMapped() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()

        return null;
    }

    @Override
    public List<Person> getPersonsPromoteProgrammer() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPersonInNewPosition()
        // y para setear a una persona el methodo this.ascenderProgramador(person)

        return null;
    }

    @Override
    public List<Person> getAllpersonSortByAge() {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()

        return null;
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
