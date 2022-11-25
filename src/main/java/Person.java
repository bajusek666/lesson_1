public class Person {

    private String name;
    private String secondName;

    private char gender;

    public Person(String name, String secondName, char gender) {
        this.name = name;
        this.secondName = secondName;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString(){
        return name + " " + secondName;
    }

    public char getGender(){
        return gender;
    }

}
