public class Main {
    public static void main(String[] args) {
        Person slawek = new Person("Sławek", "Bajus", Gender.MALE,50, "09.12.1971");
        Person dorota = new Person("Dorota", "Bajus", Gender.FEMALE,48,"14.02.1973");
        Person angelika = new Person("Angelika", "Bajus", Gender.FEMALE,27,"23.12.1995");
        Person sebastian = new Person("Sebastian", "Bajus", Gender.MALE,24,"11.07.1998");
        Person kamil = new Person("Kamil", "Bajus", Gender.MALE,20,"13.08.2002");

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