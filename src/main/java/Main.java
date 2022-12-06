import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person slawek = new Person("Sławek", "Bajus", Gender.MALE, LocalDate.of(1971,12,9));
        Person dorota = new Person("Dorota", "Bajus", Gender.FEMALE,LocalDate.of(1973,2,14));
        Person angelika = new Person("Angelika", "Bajus", Gender.FEMALE,LocalDate.of(1995,12,23));
        Person sebastian = new Person("Sebastian", "Bajus", Gender.MALE,LocalDate.of(1998,7,11));
        Person kamil = new Person("Kamil", "Bajus", Gender.MALE,LocalDate.of(2002,8,13));

        ListOfPeople bajusFamily = new ListOfPeople();

        bajusFamily.addPerson(slawek);
        bajusFamily.addPerson(dorota);
        bajusFamily.addPerson(angelika);
        bajusFamily.addPerson(sebastian);
        bajusFamily.addPerson(kamil);

        bajusFamily.print();

        System.out.println("Males: " + bajusFamily.malesCount());
        System.out.println("Females: " + bajusFamily.femalesCount());

        bajusFamily.printLongestFirstName();
        bajusFamily.printLongestLastName();


        bajusFamily.printOldestPerson();













    }
}