import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListOfPeopleTest {

    ListOfPeople listOfPeople = new ListOfPeople();

    @Test
    public void arrayListInitialSize0() {
        assertEquals(0, listOfPeople.getSize());
    }

    @Test
    public void arrayListSize1AfterAddingPerson() {
        Person person = new Person("Kamil", "Bajus", LocalDate.of(2002, 8, 13));
        listOfPeople.addPerson(person);
        assertEquals(1, listOfPeople.getSize());
    }


    @Test
    public void longestName() {
        Person person = new Person("Wierzchosława", "Ratajczak", LocalDate.of(1980, 12, 15));
        listOfPeople.addPerson(person);
        listOfPeople.printLongestFirstName();

        //tutaj nie wiem jak sprawdzić czy tekst wypisywany na konsolę jest zgodny z prawdą

    }


}