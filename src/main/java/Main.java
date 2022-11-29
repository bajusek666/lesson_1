public class Main {
    public static void main(String[] args) {
        Person slawek = new Person("Sławek", "Bajus", Gender.MALE);
        Person dorota = new Person("Dorota", "Bajus", Gender.FEMALE);
        Person angelika = new Person("Angelika", "Bajus", Gender.FEMALE);
        Person sebastian = new Person("Sebastian", "Bajus", Gender.MALE);
        Person kamil = new Person("Kamil", "Bajus", Gender.MALE);

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







    }
}