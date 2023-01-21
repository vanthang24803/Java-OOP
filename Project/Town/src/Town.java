import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> families;
    List<Person> persons;

    public Town() {
        this.families = new ArrayList<>();
        this.persons = new ArrayList<>();
    }

    // add member family

    public void addFamily(Family family) {
        families.add(family);
    }

    // add member person

    public void addPerson(Person person) {
        persons.add(person);
    }

    // show Infor

    public void showInforFamily() {
        this.families.forEach(family -> System.out.println(family.toString()));
    }

    public void showInforPerson() {
        this.persons.forEach(person -> System.out.println(person.toString()));
    }

}
