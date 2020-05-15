import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TextbookTest {
   @Test
    public void addHuman() {
       final Textbook book = new Textbook();
       assertTrue(book.addHuman("Gleb", new Address("Lazarevskoe", 32, 13)));
       assertEquals(new Address("Lazarevskoe", 32, 13), book.getAddress("Gleb"));
       assertFalse(book.addHuman("Gleb", new Address("Lazarevskoe", 32, 14)));
   }
   @Test
    public void deleteHuman() {
       final Textbook book = new Textbook();
       book.addHuman("Gleb", new Address("Lazarevskoe", 32, 13));
       assertTrue(book.deleteHuman("Gleb"));
       assertNull(book.getAddress("Gleb"));
       assertFalse(book.deleteHuman("Edik"));
   }
   @Test
    public void changeAddress() {
       final Textbook book = new Textbook();
       book.addHuman("Gleb", new Address("Lazarevskoe", 32, 13));
       Textbook bookClone = new Textbook();
       bookClone.addHuman("Gleb", new Address("Lazarevskoe", 32, 13));
       final Address address = new Address("Saint-Petersburg", 16, 540);
       final Address oldAddress = new Address("Lazarevskoe", 32, 13);
       assertTrue(book.changeAddress("Gleb", address));
       assertEquals(new Address("Saint-Petersburg", 16, 540), book.getAddress("Gleb"));
       assertFalse(book.changeAddress("gleb", address));
       assertFalse(book.changeAddress("Gleb", address));
       assertFalse(bookClone.changeAddress("Gleb", oldAddress));
   }
   @Test
   public void getAddress() {
      final Textbook book = new Textbook();
      book.addHuman("Gleb", new Address("Lazarevskoe", 32, 13));
      assertEquals(new Address("Lazarevskoe", 32, 13), book.getAddress("Gleb"));
   }
   @Test
   public void findPersons() {
      final Textbook book = new Textbook();
      book.addHuman("Gleb", new Address("Lazarevskoe", 32, 13));
      book.addHuman("Andrew", new Address("Saint-Petersburg", 16, 403));
      book.addHuman("Max", new Address("Saint-Petersburg", 16, 532));
      book.addHuman("Edik", new Address("Lazarevskoe", 153, 3));
      final List<String> testList1 = Arrays.asList("Edik", "Gleb");
      assertEquals(testList1, book.findPersons("Lazarevskoe"));
      final List<String> testList2 = Arrays.asList("Andrew", "Max");
      assertEquals(testList2, book.findPersons("Saint-Petersburg", 16));
      assertNotEquals(testList1, book.findPersons("Lazarevskoe", 32));
   }



}