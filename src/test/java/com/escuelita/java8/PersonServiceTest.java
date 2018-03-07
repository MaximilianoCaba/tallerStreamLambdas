package com.escuelita.java8;

import com.escuelita.java8.entity.Person;
import com.escuelita.java8.service.PersonServicePractice;
import com.escuelita.java8.service.PersonServiceResolution;
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
        //Se requiere
        //List<Person> personList = personServicePactice.getAllGenderMale();
        //assertTrue(personList.size() != 0);
        //assertEquals(personList.size(), 503);

        assertEquals(personServiceResolution.getAllGenderMale().size(), 13);
    }

    @Test
    public void getAverageAllAge() {
        //Ejercicio dos:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        assertEquals(personServiceResolution.getAverageAllAge(), 30);

    }

    @Test
    public void getAllPersonInNewWorkingPosition() {

        //Ejercicio cuatro:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        assertEquals(personServiceResolution.getAllPersonInNewWorkingPosition().size(), 20);

    }


    @Test
    public void getAllPersonMapped() {

        //Ejercicio cuatro:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        assertEquals(personServiceResolution.getAllPersonMapped().size(), 20);

    }

    @Test
    public void getPersonsPromoteProgrammer() {

        //Ejercicio cuatro:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        assertEquals(personServiceResolution.getPersonsPromoteProgrammer().size(), 8);

    }

    @Test
    public void getAllpersonSortByAge() {

        //Ejercicio cuatro:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        List<Person> personList = personServiceResolution.getAllpersonSortByAge();

        assertTrue(personList.get(0).getAge() <= personList.get(1).getAge());
        assertTrue(personList.get(4).getAge() <= personList.get(5).getAge());
        assertTrue(personList.get(11).getAge() <= personList.get(12).getAge());
        assertTrue(personList.get(17).getAge() <= personList.get(18).getAge());

    }


}
