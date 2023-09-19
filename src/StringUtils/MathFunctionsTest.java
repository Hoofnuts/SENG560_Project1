package StringUtils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathFunctionsTest {

    @Test
    public void addInts() {
        assertEquals("3", MathFunctions.addInts("1","2"));
    }

    @Test
    public void addShorts() {
        assertEquals("3", MathFunctions.addShorts("1","2"));
    }

    @Test
    public void addLongs() {
        assertEquals("3", MathFunctions.addLongs("1","2"));
    }

    @Test
    public void addBinary() {
        assertEquals("1000", MathFunctions.addBinary("100","100"));
    }

    @Test
    public void addOctal() {
        assertEquals("22", MathFunctions.addOctal("12","10"));
    }

    @Test
    public void addHex() {
        assertEquals("15", MathFunctions.addHex("A","B"));
    }

    @Test
    public void addFloats() {
        assertEquals("3.33812", MathFunctions.addFloats("1.12355677","2.214567"));
    }

    @Test
    public void addDoubles() {
        assertEquals("3.33812", MathFunctions.addDoubles("1.12355677","2.214567"));
    }

    @Test
    public void subInts() {
        assertEquals("9", MathFunctions.subInts("12","3"));
    }

    @Test
    public void subShorts() {
        assertEquals("3", MathFunctions.subShorts("9","6"));
    }

    @Test
    public void subLongs() {
        assertEquals("23", MathFunctions.subLongs("25","2"));
    }

    @Test
    public void subBinary() {
        assertEquals("10", MathFunctions.subBinary("1000","0110"));
    }

    @Test
    public void subOctal() {
        assertEquals("1", MathFunctions.subOctal("10","7"));
    }

    @Test
    public void subHex() {
        assertEquals("5", MathFunctions.subHex("F","A"));
    }

    @Test
    public void subFloats() {
        assertEquals("3.06878", MathFunctions.subFloats("9.312345","6.2435678"));
    }

    @Test
    public void subDoubles() {
        assertEquals("3.11108", MathFunctions.subDoubles("9.32342353","6.2123425"));
    }

    @Test
    public void mulInts() {
        assertEquals("6", MathFunctions.mulInts("3","2"));
    }

    @Test
    public void mulShorts() {
        assertEquals("6", MathFunctions.mulShorts("3","2"));
    }

    @Test
    public void mulLongs() {
        assertEquals("6", MathFunctions.mulLongs("3","2"));
    }

    @Test
    public void mulBinary() {
        assertEquals("1000", MathFunctions.mulBinary("100","10"));
    }

    @Test
    public void mulOctal() {
        assertEquals("100", MathFunctions.mulOctal("10","10"));
    }

    @Test
    public void mulHex() {
        assertEquals("64", MathFunctions.mulHex("A","A"));
    }

    @Test
    public void mulFloats() {
        assertEquals("7.26", MathFunctions.mulFloats("3.3","2.2"));
    }

    @Test
    public void mulDoubles() {
        assertEquals("5.25", MathFunctions.mulDoubles("3.5","1.5"));
    }

    @Test
    public void divInts() {
        assertEquals("3", MathFunctions.divInts("9","3"));
    }

    @Test
    public void divShorts() {
        assertEquals("3", MathFunctions.divShorts("9","3"));
    }

    @Test
    public void divLongs() {
        assertEquals("3", MathFunctions.divLongs("9","3"));
    }

    @Test
    public void divBinary() {
        assertEquals("100", MathFunctions.divBinary("1000","10"));
    }

    @Test
    public void divOctal() {
        assertEquals("2", MathFunctions.divOctal("22","10"));
    }

    @Test
    public void divHex() {
        assertEquals("A", MathFunctions.divHex("AA","10"));
    }

    @Test
    public void divFloats() {
        assertEquals("4.0", MathFunctions.divFloats("12.4","3.1"));
    }

    @Test
    public void divDoubles() {
        assertEquals("4.0", MathFunctions.divDoubles("12.4","3.1"));
    }
}