package Counter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void getInitialNumberofSavedRows() {

        Counter counter = new Counter();
        int actual = counter.getRows();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setTwoRows() {
        Counter counter = new Counter();
        counter.checkText("Hej jag heter Lilian");
        counter.checkText("Hur många rader nu");
        int actual = counter.getRows();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testAllChars() {
        Counter counter = new Counter();
        counter.checkText("Testar antal tecken");

        int actual = counter.getTotalChars();
        int expected = 19;

        assertEquals(expected, actual);

    }



}
