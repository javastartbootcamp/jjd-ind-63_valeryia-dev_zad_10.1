package pl.javastart.task.io;

import pl.javastart.task.model.Person;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public Person readAndCreatePerson() {
        System.out.println("Podaj imię");
        String name = sc.nextLine();
        System.out.println("Podaj wiek");
        int age = sc.nextInt();
        sc.nextLine();
        return new Person(name, age);
    }
}
