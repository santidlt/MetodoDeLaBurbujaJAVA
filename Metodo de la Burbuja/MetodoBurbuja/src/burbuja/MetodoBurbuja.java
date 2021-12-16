package burbuja;

import java.util.Scanner;

public class MetodoBurbuja {

    public static void main(String args[]) {

        int arreglo[] = new int[5];
        int auxiliar = 0;
        Scanner in = new Scanner(System.in);


        //introducir valores desde teclado

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("introduce el valor de la posición " + i + " :");
            arreglo[i] = in.nextInt();
            System.out.println("");
        }

        //Aplicando el metodo de la burbuja

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }

        //Mostrando los datos ordenados
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }
}
