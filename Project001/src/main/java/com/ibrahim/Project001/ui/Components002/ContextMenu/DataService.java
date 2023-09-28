package com.ibrahim.Project001.ui.Components002.ContextMenu;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public static List<Person> getPeople(int count) {
        List<Person> people = new ArrayList<>();

        // Generate 'count' number of Person objects (for demonstration purposes)
        for (int i = 1; i <= count; i++) {
            Person person = new Person();
            // Initialize properties of the Person object as needed
            // Add the Person object to the list
            people.add(person);
        }

        return people;
    }
}

