package es.upm.miw.iwvg.forge.junit;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 *
 * @author jbernal
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        if (this.denominator == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        }
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        if (this.denominator == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        }
        return denominator;
    }



    public boolean isPropia(){

        return this.numerator < this.denominator;
    }

    public boolean isImpropia(){

        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        boolean result = (this.getNumerator() * fraction.getDenominator()) ==
                (this.getDenominator() * fraction.getNumerator());
        return result;
    }

    public int fractionMayorMenor(double numerador_fraccion_comp, double denominador_fraccion_comp){

        double valor_a_comparar = numerador_fraccion_comp / denominador_fraccion_comp;
        int mayor = 1;
        int igual = 0;
        int menor = -1;
        if ( this.decimal() > valor_a_comparar){
            return mayor;
        } else {
            if ( this.decimal() == valor_a_comparar){
                return igual;
            }
            else {return menor; }
        }
    }

}
