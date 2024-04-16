
package Clases;

/**
 *
 * @author Lj
 */
public class Operaciones {
    public float suma(float num1, float num2) {
        return num1 + num2;
    }

    public float resta(float num1, float num2) {
        return num1 - num2;
    }

    public float multiplicacion(float num1, float num2) {
        return num1 * num2;
    }

    public float division(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }

    public float raizCuadrada(float num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return (float) Math.sqrt(num1);
    }

    public float potencia(float num1, float num2) {
        return (float) Math.pow(num1, num2);
    }

    public float seno(float num1) {
        return (float) Math.sin(num1);
    }

    public float coseno(float num1) {
        return (float) Math.cos(num1);
    }

    public float raizCubica(float num1) {
        return (float) Math.cbrt(num1);
    }

    public float mayor(float num1, float num2) {
        return Math.max(num1, num2);
    }
}