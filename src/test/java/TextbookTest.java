import org.junit.jupiter.api.Test;

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
       final Adress adress = new Adress("Saint-Petersburg", 16, 540);
       assertTrue(book.changeAdress("Gleb", adress));
       assertFalse(book.changeAdress("gleb", adress));
   }


}