package com.escuelita.java8.utils;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.IntStream;

public class GeneratorRowSql {

    public List<String> generatorRowRandomPerson(int cantRow){

        List<String> listRowSql = new ArrayList<>();
        String comma = ",";
        String specialQuote = "'";
        Map<Integer, String> jobMap = new HashMap<>();
        jobMap.put(0, "desocupado");
        jobMap.put(1, "estudiante");
        jobMap.put(2, "relacion de dependencia");
        jobMap.put(3, "monotributista");

        IntStream.rangeClosed(1, cantRow).forEach(position -> {

            Random r = new Random();
            char gender = r.nextBoolean() ? 'M' : 'F';
            int age = (int) (Math.random() * (89));
            int job = (int) (Math.random() * (4));
            Faker faker = new Faker();
            String name = faker.name().fullName();
            StringBuilder row = new StringBuilder();
            row.append("INSERT INTO persons (ID, NAME, AGE, GENDER, OCCUPATION) VALUES (");
            row.append(position);
            row.append(comma);
            row.append(specialQuote);
            row.append(name);
            row.append(specialQuote);
            row.append(comma);
            row.append(age);
            row.append(comma);
            row.append(specialQuote);
            row.append(gender);
            row.append(specialQuote);
            row.append(comma);
            row.append(specialQuote);
            row.append(jobMap.get(job));
            row.append(specialQuote);
            row.append(");");

            listRowSql.add(row.toString());

        });
        return listRowSql;
    }
}
