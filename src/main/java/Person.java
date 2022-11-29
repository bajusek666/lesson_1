public class Person {

    private String firstName;
    private String lastName;

    private Gender gender;

    public Person(String name, String lastName, Gender gender) {
        this.firstName = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public Gender getGender(){
        return gender;
    }

}
