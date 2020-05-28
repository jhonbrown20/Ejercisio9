package Ejercisio9;

import java.util.Scanner;

public class Ejercisio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        float suma_p = 0;
        float resta_n = 0;
        int contador_positivo = 0;
        int contador_negativo = 0;
        int contador_ceros = 0;
        int numero;
        float promedio_suma;
        float promedio_resta;

        System.out.println(" digite cuantos numeros quiere realizar la operacion");
        n1 = entrada.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println(" por favor digitar el numero");
            numero = entrada.nextInt();
            if (numero > 0) {
                suma_p = suma_p + numero;
                contador_positivo++;

            } else if (numero < 0) {
                resta_n = numero + resta_n;
                contador_negativo++;

            } else if (numero == 0) {
                contador_ceros++;

            }

        }
        if (contador_positivo == 0) {
            System.out.println(" no se puede realizar la operacion");
        } else if (contador_positivo != 0) {
            promedio_suma = (suma_p / contador_positivo);
            System.out.println("el promedio de los numeros positivos es " + promedio_suma);

        }
        if (contador_negativo == 0) {
            System.out.println(" no se puede realizar la operacion");
        } else if (contador_negativo != 0) {
            promedio_resta = (resta_n / contador_negativo);
            System.out.println(" el promedio de numeros negativos es " + promedio_resta);

        }
        System.out.println(" la suma de los numeros positivos es " + suma_p);
        System.out.println(" la resta de los numeros negativos es " + resta_n);

        System.out.println(" la cantidad de ceros es " + contador_ceros);
    }
}
