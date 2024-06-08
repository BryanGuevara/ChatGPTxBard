package clases;

public class Main {
    public static void main(String[] args) {
        // Aquí puedes llamar a las funciones de la Calculadora u otras clases que creemos.
    }
}

class Calculadora {
    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.err.println("Error: División por cero");
            return Double.NaN; // Retornar NaN (Not a Number) en caso de división por cero
        }
    }
}
