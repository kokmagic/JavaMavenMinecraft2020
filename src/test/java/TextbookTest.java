import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class TextbookTest {
   @Test
    public void addHuman() {
       final Textbook book = new Textbook();
       assertTrue(book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13)));
       assertFalse(book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 14)));
   }
   @Test
    public void deleteHuman() {
       final Textbook book = new Textbook();
       book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13));
       assertTrue(book.deleteHuman("Gleb"));
       assertFalse(book.deleteHuman("Edik"));
   }
   @Test
    public void changeAdress() {
       final Textbook book = new Textbook();
       book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13));
       Textbook bookClone = new Textbook();
       bookClone.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13));
       final Adress adress = new Adress("Saint-Petersburg", 16, 540);
       final Adress oldAdress = new Adress("Lazarevskoe", 32, 13);
       assertTrue(book.changeAdress("Gleb", adress));
       assertFalse(book.changeAdress("gleb", adress));
       assertFalse(book.changeAdress("Gleb", adress));
       assertFalse(bookClone.changeAdress("Gleb", oldAdress));
   }
   @Test
   public void getAdress() {
      final Textbook book = new Textbook();
      book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13));
      assertEquals(new Adress("Lazarevskoe", 32, 13), book.getAdress("Gleb"));
   }
   @Test
   public void findPersons() {
      final Textbook book = new Textbook();
      book.addHuman("Gleb", new Adress("Lazarevskoe", 32, 13));
      book.addHuman("Andrew", new Adress("Saint-Petersburg", 16, 403));
      book.addHuman("Max", new Adress("Saint-Petersburg", 16, 532));
      book.addHuman("Edik", new Adress("Lazarevskoe", 153, 3));
      assertEquals(new HashSet<>()), book.findPersons("Lazarevskoe"));
   }



}