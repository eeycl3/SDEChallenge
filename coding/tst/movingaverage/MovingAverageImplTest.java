package movingaverage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovingAverageImplTest {

    private MovingAverage underTest;

    @Test
    public void test_addWithDoubleType_succeed() {
        underTest = new MovingAverageImpl<Double>();
        Double element = 3.0;
        underTest.add(element);
        assertEquals(element, underTest.get(0));
    }

    @Test
    public void test_addWithNull_throwException() {
        underTest = new MovingAverageImpl<Double>();
        assertThrows(NullPointerException.class, () -> underTest.add(null));
    }

    @Test
    public void test_getWithIntegerType_succeed() {
        underTest = new MovingAverageImpl<Integer>();
        Integer element1 = 3;
        Integer element2 = 5;
        underTest.add(element1);
        underTest.add(element2);
        assertEquals(element1, underTest.get(0));
        assertEquals(element2, underTest.get(1));
    }

    @Test
    public void test_getWithIntegerType_throwException() {
        underTest = new MovingAverageImpl<Integer>();
        Integer element1 = 3;
        Integer element2 = 5;
        underTest.add(element1);
        underTest.add(element2);
        assertThrows(IndexOutOfBoundsException.class, () -> underTest.get(3));
    }

    @Test
    public void test_getMovingAverageWithValidInput_succeed() {
        underTest = new MovingAverageImpl<Double>();
        Double element1 = 3.0;
        Double element2 = 4.0;
        underTest.add(element1);
        underTest.add(element2);
        assertEquals(3.5, underTest.getMovingAverage(2));
        assertEquals(4.0, underTest.getMovingAverage(1));
    }

    @Test
    public void test_getMovingAverageWithInvalidInput_throwException() {
        underTest = new MovingAverageImpl<Integer>();
        Integer element1 = 3;
        underTest.add(element1);
        assertThrows(InvalidInputException.class, () -> underTest.getMovingAverage(3));
    }

}