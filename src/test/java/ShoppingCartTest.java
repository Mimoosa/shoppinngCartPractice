import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    @Test
    void testJapanese() {
        ResourceBundle rb = ResourceBundle.getBundle("Messages", new Locale("ja", "JP"));
        assertEquals("こんにちは", rb.getString("greeting"));
    }

    @Test
    void testEnglish(){
        ResourceBundle rb = ResourceBundle.getBundle("Messages", new Locale("en", "US"));
        assertEquals("Hello", rb.getString("greeting"));
    }
}