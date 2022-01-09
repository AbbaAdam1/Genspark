import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GuessTNJUTest {
    GuessTNJU guessTNJU;

    @BeforeEach
    void setUp() {
        guessTNJU = new GuessTNJU();
        guessTNJU.setName("Abba");
        guessTNJU.setRetry("y");
        guessTNJU.setChoice(1);
        guessTNJU.setRng(5);
    }

    @Test
    void getRng() {
        assertEquals(5, guessTNJU.getRng(), "Rng Test Failed");
    }

    @Test
    void getRetry() {
        assertEquals("y", guessTNJU.getRetry(), "Retry Test Failed");
    }

    @Test
    void getName() {
        assertEquals("Abba", guessTNJU.getName(), "Name Test Failed");
    }

    @Test
    void getChoice() {
        assertEquals(1, guessTNJU.getChoice(), "Choice Test Failed");
    }

    @AfterEach
    void tearDown() {
    }
}