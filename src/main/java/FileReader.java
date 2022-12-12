
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class FileReader {


    public ListOfPeople read() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a file name: ");
        String file = scanner.nextLine();


        ListOfPeople people = new ListOfPeople();

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] LINE_SPLITTER = line.split(" ");
                String[] DATE_SPLITTER = LINE_SPLITTER[2].split("-");
                int year = Integer.valueOf(DATE_SPLITTER[0]);
                int month = Integer.valueOf(DATE_SPLITTER[1]);
                int day = Integer.valueOf(DATE_SPLITTER[2]);

                String firstName = LINE_SPLITTER[0];
                String secondName = LINE_SPLITTER[1];
                LocalDate birthDate = LocalDate.of(year, month, day);

                Person person = new Person(firstName, secondName, birthDate);
                people.addPerson(person);
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return people;
    }
}
