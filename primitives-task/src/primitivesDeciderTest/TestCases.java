package primitivesDeciderTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testCase1() {
        String num = "-150";
        String expected = num + " can be fitted in:\n" +
                "short\n" +
                "int\n" +
                "long";
        String actualResult = PrimitivesDecider.getDecidedTypesMessage(num);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase2() {

        String num = "150000";
        String expected = num + " can be fitted in:\n" +
                "int\n" +
                "long";
        String actualResult = PrimitivesDecider.getDecidedTypesMessage(num);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase3() {

        String num = "1500000000";
        String expected = num + " can be fitted in:\n" +
                "int\n" +
                "long";
        String actualResult = PrimitivesDecider.getDecidedTypesMessage(num);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase4() {

        String num = "213333333333333333333333333333333333";
        String expected = num + " can't be fitted anywhere";
        String actualResult = PrimitivesDecider.getDecidedTypesMessage(num);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase5() {

        String num = "-100000000000000";
        String expected = num + " can be fitted in:\n" +
                "long";
        String actualResult = PrimitivesDecider.getDecidedTypesMessage(num);
        assertEquals(expected, actualResult);
    }
}
