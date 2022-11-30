public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private int wiek;

    private String dateOfBirth;

    public Person(String name, String lastName, Gender gender, int wiek, String dateOfBirth) {
        this.firstName = name;
        this.lastName = lastName;
        this.gender = gender;
        this.wiek = wiek;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return wiek;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public Gender getGender(){
        return gender;
    }



}
