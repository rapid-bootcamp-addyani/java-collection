package listCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainImmutable {
    public static void main(String[] args) {
        Person person = new Person("Addyani", Arrays.asList("Coding", "Art", "Sport"));
        System.out.println(person);

        //Cara Salah
        //person.getHobbies().add("Gaming");

        //Cara Bener
        List<String> hobbies = new ArrayList<>(person.getHobbies());
        hobbies.add("Gaming");
        person.setHobbies(hobbies);
        System.out.println(person);
    }
}
