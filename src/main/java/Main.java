

public class Main {
    public static void main(String[] args) {

        ReadingFromAFile reading = new ReadingFromAFile();
        ListOfPeople bajusFamily = reading.readFromAFile();

        bajusFamily.print();


        bajusFamily.printLongestFirstName();
        bajusFamily.printLongestLastName();


        bajusFamily.printOldestPerson();

    }
}