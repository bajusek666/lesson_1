import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    Person p1 = new Person("Arek", "Wesołowski", LocalDate.of(1998, 10, 13));
    Person p2 = new Person("Anna", "Wesołowska", LocalDate.of(1970, 12, 13));

    @Test
    public void returnsCorrectAgeOfp1Person() {
        assertEquals(24, p1.getAge());
    }

    @Test
    public void returnsCorrectAgeOfp2Person() {
        assertEquals(51, p2.getAge());        // tylko to trochę nie ma sensu bo ten test jutro już jakby nie będzie aktualny
    }


}