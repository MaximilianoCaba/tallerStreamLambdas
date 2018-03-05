package com.escuelita.java8;

import com.escuelita.java8.service.PersonServicePractice;
import com.escuelita.java8.service.PersonServiceResolution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    PersonServicePractice personServicePactice;

    @Autowired
    PersonServiceResolution personServiceResolution;


    @Test
    public void getPersonWhyGenderIsM() {
        //Ejercicio uno:
        //Se requiere
        //List<Person> personList = personServicePactice.getAllGenderMale();
        //assertTrue(personList.size() != 0);
        //assertEquals(personList.size(), 503);

        assertTrue(personServiceResolution.getAllGenderMale().size() != 0);
    }

    @Test
    public void getAverageAllPerson() {
        //Ejercicio dos:
        //Se requiere
        //int averagePersons = personServicePactice.getAverageAllAge();
        //assertTrue(averagePersons != 0);
        //assertEquals(averagePersons, 0);

        assertEquals(personServiceResolution.getAverageAllAge(), 43);

    }

}
