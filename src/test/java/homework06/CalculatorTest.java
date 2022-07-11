package homework06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void convertUnit() {
        Assert.assertEquals("10.0", calc.convertUnit(1, "m", "dm"));
    }

    @Test
    public void calculate() {
        assertEquals("1090.0 mm", calc.calculate("10 cm + 1 m - 10 mm", "mm"));
    }
}