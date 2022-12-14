import java.util.ArrayList;

public class ListOfPeople {
    private ArrayList<Person> list;

    public ListOfPeople() {
        this.list = new ArrayList<>();
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public Person getPerson(int index){
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }

    public int malesCount() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender().equals(Gender.MALE)) {
                counter++;
            }
        }
        return counter;
    }

    public int femalesCount() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender().equals(Gender.FEMALE)) {
                counter++;
            }
        }
        return counter;
    }

    public void print() {
        for (Person person : list) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + ", Age: " + person.getAge());
        }
    }

    public String printLongestFirstName() {
        String longest = "";
        for (Person person : list) {
            if (person.getFirstName().length() > longest.length()) {
                longest = person.getFirstName();
            }
        }
        return longest;
    }

    public String printLongestLastName() {
        String longest = "";
        for (Person person : list) {
            if (person.getLastName().length() > longest.length()) {
                longest = person.getLastName();
            }
        }
        return longest;
    }

    public void printOldestPerson() {
        int oldest = Integer.MIN_VALUE;
        String firstNameOfTheOldestPerson = null;
        String lastNameOfTheOldestPerson = null;

        for (Person person : list) {
            if (person.getAge() > oldest) {
                oldest = person.getAge();
                firstNameOfTheOldestPerson = person.getFirstName();
                lastNameOfTheOldestPerson = person.getLastName();
            }
        }

        System.out.println("The oldest person on the list is " + firstNameOfTheOldestPerson + " " + lastNameOfTheOldestPerson + " age: " + oldest);

    }
}
