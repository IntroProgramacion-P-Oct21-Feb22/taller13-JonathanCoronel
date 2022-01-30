/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo;
        String nombre;
        double[] arregloSueldos;
        int numeroDatosArreglo;
        int i = 1;
        int j;
        boolean bandera = true;
        while (bandera) {
            try {
                while (i <= 4) {
                    System.out.printf("Datos para usuario %d\n", i);
                    System.out.println("Cuantos sueldos quiere agregar al arreglo");
                    numeroDatosArreglo = entrada.nextInt();
                    if (numeroDatosArreglo < 0 || numeroDatosArreglo > 5) {
                        throw new Exception("Nuemero de sueldo fuera de rango "
                                + "Permitido");
                    }
                    arregloSueldos = new double[numeroDatosArreglo];
                    j = 0;
                    while (j < arregloSueldos.length) {
                        System.out.printf("agregue sueldo %d para usuario %d\n",
                                j, i);
                        sueldo = entrada.nextDouble();
                        if (sueldo < 0 || sueldo > 1000) {
                            throw new Exception("Sueldo fuera del rango Permitido");
                        }
                        arregloSueldos[j] = sueldo;
                        j = j + 1;
                    }

                    for (int k = 0; k < arregloSueldos.length; k++) {
                        System.out.printf("Sueldo ingresado: %.3f\n", arregloSueldos[k]);
                    }

                    i = i + 1;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
            entrada.nextLine();
            System.out.println("Desea volver a ingresar los valores, ingrese "
                    + "la palabra: si");
            String valor;
            valor = entrada.nextLine();

            if (!valor.equals("si")) {
                bandera = false;
            }

        }
        System.out.printf("%s\n", "Gracias por usar el sistema");
    }
}
