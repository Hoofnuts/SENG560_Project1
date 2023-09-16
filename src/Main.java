import StringUtils.Conversions;
import StringUtils.MathFunctions;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a program to run simple math tests on the MathFunctions class\n");

        String a = "21";
        String b = "12";
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addInts = " + MathFunctions.addInts(a, b));
        System.out.println("subInts = " + MathFunctions.subInts(a, b));
        System.out.println("mulInts = " + MathFunctions.mulInts(a, b));
        System.out.println("divInts = " + MathFunctions.divInts(a, b) + "\n");

        System.out.println("addShorts = " + MathFunctions.addShorts(a, b));
        System.out.println("subShorts = " + MathFunctions.subShorts(a, b));
        System.out.println("mulShorts = " + MathFunctions.mulShorts(a, b));
        System.out.println("divShorts = " + MathFunctions.divShorts(a, b) + "\n");

        System.out.println("addLongs = " + MathFunctions.addLongs(a, b));
        System.out.println("subLongs = " + MathFunctions.subLongs(a, b));
        System.out.println("mulLongs = " + MathFunctions.mulLongs(a, b));
        System.out.println("divLongs = " + MathFunctions.divLongs(a, b) + "\n");

        a = "1001";
        b = "0111";
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addBinary = " + MathFunctions.addBinary(a, b));
        System.out.println("subBinary = " + MathFunctions.subBinary(a, b));
        System.out.println("mulBinary = " + MathFunctions.mulBinary(a, b));
        System.out.println("divBinary = " + MathFunctions.divBinary(a, b) + "\n");

        a = "11";
        b = "10";
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addOctal = " + MathFunctions.addOctal(a, b));
        System.out.println("subOctal = " + MathFunctions.subOctal(a, b));
        System.out.println("mulOctal = " + MathFunctions.mulOctal(a, b));
        System.out.println("divOctal = " + MathFunctions.divOctal(a, b) + "\n");

        a = "B";
        b = "9";
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addHex = " + MathFunctions.addHex(a, b));
        System.out.println("subHex = " + MathFunctions.subHex(a, b));
        System.out.println("mulHex = " + MathFunctions.mulHex(a, b));
        System.out.println("divHex = " + MathFunctions.divHex(a, b) + "\n");

        a = "51.0";
        b = "22.0";
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addFloats = " + MathFunctions.addFloats(a, b));
        System.out.println("subFloats = " + MathFunctions.subFloats(a, b));
        System.out.println("mulFloats = " + MathFunctions.mulFloats(a, b));
        System.out.println("divFloats = " + MathFunctions.divFloats(a, b) + "\n");

        System.out.println("addDoubles = " + MathFunctions.addDoubles(a, b));
        System.out.println("subDoubles = " + MathFunctions.subDoubles(a, b));
        System.out.println("mulDoubles = " + MathFunctions.mulDoubles(a, b));
        System.out.println("divDoubles = " + MathFunctions.divDoubles(a, b) + "\n");

        String temp = "1001";
        System.out.println("Conversions");
        System.out.println("Binary = " + temp);
        System.out.println("binToInt = " + Conversions.binToInt(temp));
        System.out.println("intToBin = " + Conversions.intToBin(Conversions.binToInt(temp)));
        System.out.println("binToHex = " + Conversions.binToHex(temp) + "\n");

        temp = "10";
        System.out.println("Octal = " + temp);
        System.out.println("octToInt = " + Conversions.octToInt(temp));
        System.out.println("octToBin = " + Conversions.octToBin(temp));
        System.out.println("intToOct = " + Conversions.intToOct(Conversions.octToInt(temp)));
        System.out.println("binToOct = " + Conversions.binToOct(Conversions.octToBin(temp)));
        System.out.println("octToHex = " + Conversions.octToHex(temp) + "\n");

        temp = "A";
        System.out.println("Hex = " + temp);
        System.out.println("hexToInt = " + Conversions.hexToInt(temp));
        System.out.println("hexToBin = " + Conversions.hexToBin(temp));
        System.out.println("hexToOct = " + Conversions.hexToOct(temp));
        System.out.println("intToHex = " + Conversions.intToHex(Conversions.hexToInt(temp)) + "\n");


    }
}