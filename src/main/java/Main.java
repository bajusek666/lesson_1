import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person slawek = new Person("Sławek", "Bajus", 'm');
        Person dorota = new Person("Dorota", "Bajus", 'f');
        Person angelika = new Person("Angelika", "Bajus", 'f');
        Person sebastian = new Person("Sebastian", "Bajus", 'm');
        Person kamil = new Person("Kamil", "Bajus", 'm');

        ListOfPeople bajusFamily = new ListOfPeople();

        bajusFamily.addPerson(slawek);
        bajusFamily.addPerson(dorota);
        bajusFamily.addPerson(angelika);
        bajusFamily.addPerson(sebastian);
        bajusFamily.addPerson(kamil);

        bajusFamily.print();

        System.out.println("Males: " + bajusFamily.howManyMales());
        System.out.println("Females: " + bajusFamily.howManyFemales());




    }
}