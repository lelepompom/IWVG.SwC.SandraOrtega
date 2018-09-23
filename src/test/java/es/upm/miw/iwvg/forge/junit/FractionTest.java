package es.upm.miw.iwvg.forge.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4, 2);
    }

    @Test
    void testDecimal(){
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testNumerator(){
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testDenominator(){
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void divisionByZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> new Fraction( 2, 0).decimal());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }
    @Test
    void fraccion_mayor_menor(){
        Fraction fraction = new Fraction(4,2);
        assertEquals(0, fraction.fraccion_mayor_menor(4,2));
        assertEquals(-1, fraction.fraccion_mayor_menor(5,2));
        assertEquals(1, fraction.fraccion_mayor_menor(3,2));
    }
}
