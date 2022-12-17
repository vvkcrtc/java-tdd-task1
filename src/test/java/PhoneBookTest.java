import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook pb = new PhoneBook();
        int maxCount = 10;
        for(int i = 0; i < maxCount; i++) {
            pb.add("Name"+i, "+7911111111"+i);
        }
        int count = pb.add("Name0","");

        Assertions.assertTrue(count == maxCount, "Ошибка добавления");

    }
    @Test
    public void testFindByNumber() {
        PhoneBook pb = new PhoneBook();
        pb.add("Test","1234567890");
        Assertions.assertTrue(pb.findByNumber("1234567890") == "Test", "Ошибка поиска");
    }

    @Test
    public void testFindByName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Test","1234567890");
        Assertions.assertTrue(pb.findByName("Test") == "1234567890", "Ошибка поиска");
    }

}
