package pkg;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    PrimitivesDecider pd;
    @Before
    public void prep() {
        pd = new PrimitivesDecider();
    }
    @Test
    public void testCase1() {
        String num = "-150";
        pd.setNum(num);
        String expected = num + " can be fitted in:\n" +
                "short\n" +
                "int\n" +
                "long";
        assertEquals(expected, pd.decide());
    }

    @Test
    public void testCase2() {

        String num = "150000";
        pd.setNum(num);
        String expected = num + " can be fitted in:\n" +
                "int\n" +
                "long";
        assertEquals(expected, pd.decide());
    }

    @Test
    public void testCase3() {

        String num = "1500000000";
        pd.setNum(num);
        String expected = num + " can be fitted in:\n" +
                "int\n" +
                "long";
        assertEquals(expected, pd.decide());
    }

    @Test
    public void testCase4() {

        String num = "213333333333333333333333333333333333";
        pd.setNum(num);
        String expected = num + " can't be fitted anywhere";
        assertEquals(expected, pd.decide());
    }

    @Test
    public void testCase5() {

        String num = "-100000000000000";
        pd.setNum(num);
        String expected = num + " can be fitted in:\n" +
                "long";
        assertEquals(expected, pd.decide());
    }
}
