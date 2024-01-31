/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1_util;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Jose Royo Andreu
 * Class donde comprobaremos distintas cosas
 */
public class metodos_estaticos {
    
    // Comprobamos que numKM >= 0
    public static boolean comprobar(int numKM){
        return numKM >= 0;
    }
    
    // Comprobamos que el DNI tiene 9 caracteres
    public static boolean comprobar(String DNI){
        return DNI.length()== 9;
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
