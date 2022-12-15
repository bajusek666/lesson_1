import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class FileReader {

    private static final String PERSON_SPLITTER = " ";
    private static final String DATE_SPLITTER = "-";

    public ListOfPeople read(String filename) {


        ListOfPeople people = new ListOfPeople();

        try (Scanner s = new Scanner(Paths.get(filename))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] personFields = line.split(PERSON_SPLITTER);
                String[] dateFields = personFields[2].split(DATE_SPLITTER);
                int year = Integer.valueOf(dateFields[0]);
                int month = Integer.valueOf(dateFields[1]);
                int day = Integer.valueOf(dateFields[2]);

                String firstName = personFields[0];
                String secondName = personFields[1];
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
