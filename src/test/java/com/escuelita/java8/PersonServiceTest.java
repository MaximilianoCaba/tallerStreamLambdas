package com.escuelita.java8;

import com.escuelita.java8.entity.Person;
import com.escuelita.java8.service.PersonServicePractice;
import com.escuelita.java8.service.PersonServiceResolution;
import com.escuelita.java8.service.impl.PersonServiceResolutionImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    PersonServicePractice personServicePactice;

    @Autowired
    PersonServiceResolution personServiceResolution;


    @Test
    public void getPersonWhyGenderIsMale() {
        //Ejercicio uno:
        //Se requiere obtener una lista de todos los usuarios que son hombres
        //List<Person> personList = personServicePactice.getAllGenderMale();
        //assertEquals(personList.size(), 13);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.getAllGenderMale().size(), 13);
    }

    @Test
    public void getAverageAllAge() {
        //Ejercicio dos:
        //Se requiere averiguar cual es el promedio de edad de todas las persona
        // (suma de todas las edades / la cantidad de personas)
        //int averagePerson = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertTrue(personServiceResolution.getAverageAllAge() != 0);

    }

    @Test
    public void getAllPersonInNewWorkingPosition() {
        //Ejercicio tres:
        //Se requiere actualizar la lista principal el campo occupation haciendo una consulta por cada uno para saber su estado
        //List<Person> personList = personServicePactice.getAllPersonInNewWorkingPosition();
        //assertTrue(personList.size() != 0);
        //assertTrue(personList.get(7).getOccupation() != null);
        //assertTrue(personList.get(11).getOccupation() != null);
        //assertTrue(personList.get(17).getOccupation() != null);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.getAllPersonInNewWorkingPosition().size(), 20);
        assertTrue(personServiceResolution.getAllPersonInNewWorkingPosition().get(7).getOccupation() != null);
        assertTrue(personServiceResolution.getAllPersonInNewWorkingPosition().get(11).getOccupation() != null);
        assertTrue(personServiceResolution.getAllPersonInNewWorkingPosition().get(17).getOccupation() != null);

    }


    @Test
    public void getAllPersonMapped() {
        //Ejercicio cuatro:
        //Se requiere mapear una lista de personas
        //Map<Integer, Person> personMap = personServicePactice.getAllPersonMapped();
        //assertEquals(personMap.size() , 20);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.getAllPersonMapped().size(), 20);

    }

    @Test
    public void getPersonsPromoteProgrammer() {
        //Ejercicio cinco:
        //Se requiere devolver una lista modificada de los programadores
        //List<Person> personList = personServicePactice.getPersonsPromoteProgrammer();
        //assertEquals(averagePersons.size(), 8);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.getPersonsPromoteProgrammer().size(), 8);

    }

    @Test
    public void getAllpersonSortByAge() {
        //Ejercicio seis:
        //Se requiere ordenar de menor a mayor las edades de las personas
        //List<Person> personList1 = personServicePactice.getAllpersonSortByAge();
        //assertTrue(personList.size() != 0);
        //assertTrue(personList1.get(0).getAge() <= personList1.get(1).getAge());
        //assertTrue(personList1.get(4).getAge() <= personList1.get(5).getAge());
        //assertTrue(personList1.get(11).getAge() <= personList1.get(12).getAge());
        //assertTrue(personList1.get(17).getAge() <= personList1.get(18).getAge());

        //SOLUCION CON LA API STREAM & LAMBDAS
        List<Person> personList = personServiceResolution.getAllpersonSortByAge();
        assertTrue(personList.get(0).getAge() <= personList.get(1).getAge());
        assertTrue(personList.get(4).getAge() <= personList.get(5).getAge());
        assertTrue(personList.get(11).getAge() <= personList.get(12).getAge());
        assertTrue(personList.get(17).getAge() <= personList.get(18).getAge());

    }

    @Test
    public void getPersonByName() {
        //Ejercicio siete:
        //Se requiere buscar en una lista una persona por su nombre y retomarla
        //assertEquals(personServicePactice.findOneByName("Rogelia").getId(), 10);
        //assertNull(personServicePactice.findOneByName("wbgekugfdiuf"));

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.findOneByName("Rogelia").getId(), 10);
        assertNull(personServiceResolution.findOneByName("wbgekugfdiuf"));

    }

    @Test
    public void getPersonInTheMiddleList() {
        //Ejercicio ocho:
        //Se requiere obtener el usuario (IMPAR)o los usuarios(PAR) que se encuentra en el medio de la lista
        //assertEquals(personServicePactice.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonImpar()).get(0).getId(), 10);
        //assertEquals(personServicePactice.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonPar()).get(0).getId(), 10);
        //assertEquals(personServicePactice.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonPar()).get(1).getId(), 11);

        //SOLUCION CON LA API STREAM & LAMBDAS
        assertEquals(personServiceResolution.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonImpar()).get(0).getId(), 10);
        assertEquals(personServiceResolution.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonPar()).get(0).getId(), 10);
        assertEquals(personServiceResolution.getPersonInTheMiddleList(PersonServiceResolutionImpl.getAllPersonPar()).get(1).getId(), 11);

    }
}
