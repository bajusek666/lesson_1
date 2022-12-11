
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class ReadingFromAFile {
    public ListOfPeople readFromAFile(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a file name: ");
        String file = scanner.nextLine();


        ListOfPeople people = new ListOfPeople();

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()){
                String line = s.nextLine();
                String[] lineSplitted = line.split(" ");
                String[] dateSplitted = lineSplitted[2].split("-");
                int year = Integer.valueOf(dateSplitted[0]);
                int month = Integer.valueOf(dateSplitted[1]);
                int day = Integer.valueOf(dateSplitted[2]);

                String firstName = lineSplitted[0];
                String secondName = lineSplitted[1];
                LocalDate birthDate = LocalDate.of(year,month,day);

                Person person = new Person(firstName,secondName,birthDate);
                people.addPerson(person);
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return people;
    }
}
