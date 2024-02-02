/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1_util;

import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Royo Andreu Class donde comprobaremos distintas cosas
 */
public class metodos_estaticos {

    // Comprobamos que numKM >= 0
    public static boolean comprobar(int numKM) {
        return numKM >= 0;
    }

    // Comprobamos que el DNI tiene 9 caracteres
    public static boolean comprobar(String DNI) {
        if (DNI.length() == 9) { // Tamaño del DNI = 9
            for (int i = 0; i <= 7; i++) { // Comprobamos los primeros 8 caracteres que sean nums
                if (!Pattern.matches("[0-9]", String.valueOf(DNI.charAt(i)))) {
                    System.out.println("Deben ser 8 numeros  + 1 carácter");
                    return false;
                }
            }
            
            // Comprobamos si el ultimo caracter es una letra
            if (!Pattern.matches("[a-zA-Z]", String.valueOf(DNI.charAt(8)))) {
                System.out.println("Deben ser 8 numeros  + 1 carácter");
                return false;
            }
        } else {
            System.out.println("No son 9 digitos");
            return false;
        }
        return true;
    }

// Comprobamos que la matriculacion es anterior a la actual
    public static boolean comprobar(int dia, int mes, int año) {

        // Declaramos e iniciamos la fecha y la de hoy
        LocalDate fechaMatric = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();

        // Comprobamos que la fecha de matriculacion es anterior a hoy
        return fechaMatric.isBefore(hoy);
    }

}
