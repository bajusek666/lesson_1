import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {


    @Test
    public void shouldReturnCorrectLastNameBeWhenGivenFileName(){

        //given
        FileReader reader = new FileReader();
        String file = "testData.txt";

        //when
        reader.read(file);

        //then
        assertEquals("Ratajczak",reader.read(file).getPerson(1).getLastName());
        assertEquals("Walczak",reader.read(file).getPerson(3).getLastName());

    }

    @Test
    public void shouldReturnCorrectMonthWhenGivenFileName(){
        //given
        FileReader reader = new FileReader();
        String file = "testData.txt";

        //when
        reader.read(file);

        //then
        assertEquals(1,reader.read(file).getPerson(3).getBirthDate().getMonthValue());

    }
}