package pkg;

public class PrimitivesDecider {
    private String num;
    public PrimitivesDecider() {
        num = "";
    }
    public PrimitivesDecider(String num) {
        this.num = num;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String decide() {
        String result = "";
        String sortedTypes = "";
        try {
            result = num + " can't be fitted anywhere";

            Long.parseLong(num);
            result = num + "can be fitted in:\n";
            sortedTypes = "long";

            Integer.parseInt(num);
            sortedTypes = "int\n" + sortedTypes;

            Short.parseShort(num);
            sortedTypes = "short\n" + sortedTypes;

            Byte.parseByte(num);
            sortedTypes = "byte\n" + sortedTypes;

        }
        catch (NumberFormatException e) {
        }
        finally {
            result += sortedTypes;
        }
        return result;
    }
}
