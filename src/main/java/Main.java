public class Main {
    public static void main(String[] args) {

        if (args != null) {
            System.err.println("Nie podano pliku!");
        } else {
            String filename = args[0];
            FileReader reading = new FileReader();
            ListOfPeople bajusFamily = reading.read(filename);

            bajusFamily.print();

            bajusFamily.printLongestFirstName();
            bajusFamily.printLongestLastName();

            bajusFamily.printOldestPerson();
        }

    }
}