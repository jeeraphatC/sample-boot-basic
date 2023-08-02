package th.mfu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Test
    public void testHello() {

        // Act
        String response = controller.hello();
        // Assert
        assertEquals("Hello World!", response);
    }

    @Test
    public void testHi() {
        String response = controller.hi("tunk");
        assertEquals("Hello tunk", response);
    }

    @Test
    public void testSum() {
        String response = controller.sum(1, 2);
        assertEquals("sum 3", response);
    }
}
