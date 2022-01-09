import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class dragoncaveTest extends TestCase {

    dragoncave dragoncave;

    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
        dragoncave = new dragoncave();
    }

    @DisplayName("test")
    @Test
    public void testPrompt() {
    }

    @DisplayName("test")
    @Test
    void testResult1(){
        assertEquals(dragoncave.choice1(), dragoncave.result(1), "Result 1 Test Failed");
    }

    @DisplayName("test")
    @Test
    void testResult2(){
        assertEquals(dragoncave.choice2(), dragoncave.result(2), "Result 2 Test Failed");
    }

    @DisplayName("test")
    @Test
    public void testChoice1() {
        assertEquals("You approach the cave... \n"+
                "It is dark and spooky... \n"+
                "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                "Gobbles you down in one bite!\n", dragoncave.choice1(), "Test Failed");
    }

    @DisplayName("test")
    @Test
    public void testChoice2() {
        assertEquals("You approach the cave...\n"+
                "It is dark and spooky...\n"+
                "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                "Says that you can have all the gold in his cave!\n", dragoncave.choice2(), "Test Failed");
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
}