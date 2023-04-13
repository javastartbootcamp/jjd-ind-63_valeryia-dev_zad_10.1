package pl.javastart.task.test;

import pl.javastart.task.io.DataReader;
import pl.javastart.task.model.Person;
import pl.javastart.task.utils.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj informację o trzech unikalnych książkach");
        DataReader reader = new DataReader();
        ArrayUtils utils = new ArrayUtils();

        while (utils.getPersonNumber() < ArrayUtils.MAX_NUMBER) {
            Person person = reader.readAndCreatePerson();
            utils.getArrayWithoutDuplicates(person);
        }

        utils.printInfo();
    }
}