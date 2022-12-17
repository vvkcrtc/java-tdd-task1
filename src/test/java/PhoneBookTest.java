import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    @Test
    public void testPrintAllNames() {
        PhoneBook pb = new PhoneBook();
        List<String> names = new ArrayList<>();
        names.add("Test1");
        names.add("Test3");
        names.add("Test5");
        names.add("Test9");

        pb.add(names.get(1),"1234567890");
        pb.add(names.get(3),"1234567891");
        pb.add(names.get(2),"1234567899");
        pb.add(names.get(0),"1234567895");

        Assertions.assertLinesMatch(names, pb.printAllNames(), "Несоответствие списка" );


    }

}
