import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person slawek = new Person("Sławek","Bajus");
        Person dorota = new Person("Dorota","Bajus");
        Person angelika = new Person("Angelika","Bajus");
        Person sebastian = new Person("Sebastian", "Bajus");
        Person kamil = new Person("Kamil","Bajus");

        ArrayList<Person> people = new ArrayList<>();

        people.add(slawek);
        people.add(dorota);
        people.add(angelika);
        people.add(sebastian);
        people.add(kamil);

        for (Person person: people) {
            System.out.println(person.getName() + " " + person.getSecondName());
        }





    }
}