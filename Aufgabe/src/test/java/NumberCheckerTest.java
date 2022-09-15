import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    public NumberChecker numberChecker = new NumberChecker();

    @Test
   public void isDivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @Test
    public void is5DivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(5);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, 9, 21})
    public void areDivisibleByThree(int number){
        assertTrue(numberChecker.isDivisibleByThree(number));
    }
}