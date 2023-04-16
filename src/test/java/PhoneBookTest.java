import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class PhoneBookTest {
    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();

        int resultFirst = phoneBook.add("Ivan", 89521458963L);
        int resultSecond = phoneBook.add("Sveta", 89063415658L);
        int resultThird = phoneBook.add("Sveta", 89063415658L);

        Assertions.assertEquals(1, resultFirst);
        Assertions.assertEquals(2, resultSecond);
        Assertions.assertEquals(2, resultThird);
    }


    @Test
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", 89521458963L);
        phoneBook.add("Sveta", 89063415658L);

        String name = phoneBook.findByNumber(89063415658L);

        Assertions.assertEquals("Sveta", name);

    }


    @Test
    void findByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", 89521458963L);
        phoneBook.add("Sveta", 89063415658L);

        Long number = phoneBook.findByName("Sveta");

        Assertions.assertEquals(89063415658L, number);

    }

    @Test
    void printAllNames() throws Exception {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", 89521458963L);
        phoneBook.add("Sveta", 89063415658L);

        String text = tapSystemOut(phoneBook::printAllNames);

        Assertions.assertEquals("[Ivan, Sveta]", text.trim());
    }
}
