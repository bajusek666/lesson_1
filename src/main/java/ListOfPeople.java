import java.util.ArrayList;

public class ListOfPeople {
    private ArrayList<Person> list;

    public ListOfPeople() {
        this.list = new ArrayList<>();
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public int howManyMales() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender() == 'm') {
                counter++;
            }
        }
        return counter;
    }  // returns how many Males are on the list

    public int howManyFemales() {
        int counter = 0;

        for (Person person : list) {
            if (person.getGender() == 'f') {
                counter++;
            }
        }
        return counter;
    } // returns how many Females are on the list

    public void print() {
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getSecondName());
        }
    } // prints out names and second names of people on the list


}
