import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
