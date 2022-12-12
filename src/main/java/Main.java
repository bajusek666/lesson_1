

public class Main {
    public static void main(String[] args) {

        FileReader reading = new FileReader();
        ListOfPeople bajusFamily = reading.read();

        bajusFamily.print();


        bajusFamily.printLongestFirstName();
        bajusFamily.printLongestLastName();


        bajusFamily.printOldestPerson();

    }
}