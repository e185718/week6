import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sampleTest {

    @Test
    void add() {
        sample sample2 = new sample();
        int result = sample2.add(2 ,3);
        assertEquals(result, 5);
    }
}