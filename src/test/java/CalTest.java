import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    private Cal cal = new Cal();

    @Test
    void sum() {
        assertEquals(5, cal.sum(2, 3));
    }

    @Test
    void sub() {
        assertEquals(2, cal.sub(5, 3));
    }

    @Test
    void mul() {
        assertEquals(6, cal.mul(2, 3));
    }

    @Test
    void div() {
        assertEquals(2, cal.div(6, 3));
    }
}