package iterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Richi");
        names.add("Umi");
        names.addAll(List.of("Sri", "Ahmad", "Key", "Dono"));
        names.remove("Umi");
        names.removeAll(Arrays.asList("Key", "Sri"));

        System.out.println(names.contains("Dono"));
        System.out.println(names.containsAll(Arrays.asList("Key", "Dono")));

        // loop data
        for (String name: names){
            System.out.println(name);
        }

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"Adi","Padang"));
        persons.add(new Person(2,"Yusuf","Medan"));
        persons.add(new Person(3,"Mithoha","Bandung"));
        persons.addAll( Arrays.asList(new Person(4,"Minantu","Bandung")));
        persons.addAll( Arrays.asList(
                new Person(5,"Aceng","Tasikmalaya"),
                new Person(6,"David","Medan")
        ));

        for (Person p: persons){
            System.out.println(p);
        }

    }
}

