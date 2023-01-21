import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;

    public Hotel() {
        persons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public boolean delete(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person != null) {
            this.persons.remove(person);
            return true;
        } else {
            return false;
        }
    }

    public int caculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person != null) {
            return person.getRoom().getPrice() * person.getNumberRent();
        } else {
            return 0;
        }
    }

    public void show() {
        this.persons.forEach(person -> System.out.println(person.toString()));
    }

}
