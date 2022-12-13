import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;

    private LocalDate birthDate;


    public Person(String name, String lastName, Gender gender, LocalDate birthDate) {
        this.firstName = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Person(String name, String lastName, LocalDate birthDate) {
        this.firstName = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {

        int years = 0;

        years = LocalDate.now().getYear() - birthDate.getYear();
        if (years == 0) {
            return 0;
        }

        if (LocalDate.now().getMonthValue() < birthDate.getMonthValue()) {
            return years - 1;
        }

        if (LocalDate.now().getMonthValue() == birthDate.getMonthValue()) {
            if (LocalDate.now().getDayOfMonth() < birthDate.getDayOfMonth()) {
                return years - 1;
            }
            return years;
        }

        return years;


    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public Gender getGender() {
        return gender;
    }


}
