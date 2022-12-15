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
}
