package primitivesDeciderTest;

public class PrimitivesDecider {
    private static int countTypesNumFits(String num) {
        int countedTypes = 0;
        try {
            long parsedNum = Long.parseLong(num);
            if (Byte.MIN_VALUE <= parsedNum && parsedNum <= Byte.MAX_VALUE) {
                countedTypes = 4;
            }
            else if (Short.MIN_VALUE <= parsedNum && parsedNum <= Short.MAX_VALUE) {
                    countedTypes = 3;
                }
                else if (Integer.MIN_VALUE <= parsedNum && parsedNum <= Integer.MAX_VALUE) {
                        countedTypes = 2;
                    }
                    else countedTypes = 1;
        }
        catch (NumberFormatException e) {
            System.out.println("Provided input " + num + " is too big or not a number");
        }
        return countedTypes;
    }

    public static String getDecidedTypesMessage(String num) {
        String result;
        int countedTypes = countTypesNumFits(num);
        if (countedTypes == 0) {
            result = num + " can't be fitted anywhere";
        }
        else {
            result = num + " can be fitted in:";
            switch (countedTypes) {
                case 4:
                    result += "\n" + "byte";
                case 3:
                    result += "\n" + "short";
                case 2:
                    result += "\n" + "int";
                case 1:
                    result += "\n" + "long";
            }
        }
        return result;
    }
}