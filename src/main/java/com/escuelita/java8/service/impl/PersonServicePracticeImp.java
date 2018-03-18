package com.escuelita.java8.service.impl;

import com.escuelita.java8.entity.Person;
import com.escuelita.java8.repository.PersonRepository;
import com.escuelita.java8.service.PersonServicePractice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonServicePracticeImp implements PersonServicePractice {

    /*
     * Person object
     *
     * id (identificador)
     * name (nombre)
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

    @Override
    public Person findOneByName(String personName) {
        //Material para realizar la tarea:
        //se debe usar la lista this.getAllPerson()

        return null;
    }

    @Override
    public List<Person> getPersonInTheMiddleList(List<Person> listPersons) {
        //Material para realizar la tarea:
        //se puede usar getListCut() para obtener la posicion de cortes de un array.
        //EJEMPLO de un array IMPAR de 9 elementos se obtiene [3, 1] donde el 3 es el primer corte,
        //y el segundo valor la cantidad de posiciones en el que se debe hacer el segundo corte
        // [0,1,2,3,4,5,6,7,8] -> para obtener el 4 corto el array en la posicion 3 -> [4,5,6,7,8] ->
        // y ahora corto desde la posicion 1 en adelante (elemento 5) -> asi obtengo el 4.
        //PARA NUMEROS PARES SE OBTIENE 2 ELEMENTOS [0,1,2,3] -> se obtienen el 1 y el 2;

        return null;
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
