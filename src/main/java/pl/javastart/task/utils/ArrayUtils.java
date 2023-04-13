package pl.javastart.task.utils;

import pl.javastart.task.model.Person;

public class ArrayUtils {
    public static final int MAX_NUMBER = 3;
    private Person[] people = new Person[MAX_NUMBER];
    private int personNumber = 0;

    public int getPersonNumber() {
        return personNumber;
    }

    private void addPerson(Person person) {
        if (personNumber < people.length) {
            people[personNumber] = person;
            personNumber++;
        }
    }

    private boolean isDuplicate(Person person) {
        boolean isDuplicate = false;
        for (int i = 0;  people[i] != null; i++) {
            if (person.equals(people[i])) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    public void getArrayWithoutDuplicates(Person person) {
        if (isDuplicate(person) == false) {
            addPerson(person);
        } else {
            System.out.println("Duplicate");
        }
    }

    public void printInfo() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}


