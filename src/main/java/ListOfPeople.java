import java.util.ArrayList;

public class ListOfPeople implements Behaviours {
    private ArrayList<Person> list;

    public ListOfPeople() {
        this.list = new ArrayList<>();
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    @Override
    public int malesCount() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender().equals(Gender.MALE)) {
                counter++;
            }
        }
        return counter;
    }
    @Override
    public int femalesCount() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender().equals(Gender.FEMALE)) {
                counter++;
            }
        }
        return counter;
    }
    @Override
    public void print() {
        for (Person person : list) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " +person.getGender().getValue());
        }
    }
    @Override
    public void printLongestFirstName() {
        String longest = "";
        for (Person person : list) {
            if (person.getFirstName().length() > longest.length()) {
                longest = person.getFirstName();
            }
        }
        System.out.println("The longest firstname is: " + longest);
    }
    @Override
    public void printLongestLastName(){
        String longest = "";
        for (Person person : list) {
            if (person.getLastName().length() > longest.length()) {
                longest = person.getLastName();
            }
        }
        System.out.println("The longest lastname is: " + longest);
    }
}
