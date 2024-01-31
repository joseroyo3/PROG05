/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.metodos_estaticos;
import static PROG05_Ejerc1_util.metodos_estaticos.comprobar;
import java.util.Scanner;

/**
 *
 * @author Jose Royo Andreu Gestión de un vehiculo
 */
public class Principal {

    public static void main(String[] args) {
        // Declaramos el scanner, opcion del menu y el objeto vehiculo
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Vehiculo vehiculo = new Vehiculo();
        boolean sinDatos = true;

        // Bucle menú
        do {
            System.out.println("""
                           1. Nuevo Veh\u00edculo
                           2. Ver matr\u00edcula
                           3. Ver N\u00famero de Kil\u00f3metros
                           4. Actualziar Kil\u00f3metros
                           5. Ver a\u00f1os de antig\u00fcedad
                           6. Mostrar propietario
                           7. Mostrar descripci\u00f3n
                           8. Mostrar precio
                           9. Salir""");
            opcion = teclado.nextInt();
            // Evitamos error de salto de linea con teclado.nextLine
            teclado.nextLine();

            /* 
            En caso de que el vehiculo esté vacio, solo podrá seleccionar
            la opcion 1
             */
            if (sinDatos) {
                opcion = 1;
            }

            switch (opcion) {
                case 1:

                    System.out.print("Digame la marca: ");
                    vehiculo.setMarca(teclado.nextLine());

                    System.out.print("Digame la matricula: ");
                    vehiculo.setMatricula(teclado.nextLine());

                    System.out.print("Digame el nombre del propietario: ");
                    vehiculo.setPropietario(teclado.nextLine());

                    // Comprobamos DNI
                    System.out.print("Digame su DNI: ");
                    vehiculo.setDNI(teclado.nextLine());
                    if (!comprobar(vehiculo.getDNI())) {
                        System.out.println("ERROR al introducir el DNI");
                        Borrar(vehiculo);
                        sinDatos = true;
                        break;
                    }

                    // Comprobamos numero de km >= 0
                    System.out.print("Digame el numero total de km: ");
                    vehiculo.setNumKM(teclado.nextInt());
                    teclado.nextLine();
                    if (!comprobar(vehiculo.getNumKM())) {
                        System.out.println("ERROR\n Lom km no pueden ser menor que 0");
                        Borrar(vehiculo);
                        sinDatos = true;
                        break;
                    }

                    // Descripcion
                    System.out.print("Digame una descripcion: ");
                    vehiculo.setDescripcion(teclado.nextLine());

                    // Precio
                    System.out.print("Digame el precio: ");
                    vehiculo.setPrecio(teclado.nextInt());
                    teclado.nextLine();

                    // Intrducimos fecha de matriculacion
                    System.out.print("Digame el dia de la matriculación: ");
                    vehiculo.setDia(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Digame el mes de la matriculación: ");
                    vehiculo.setMes(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Digame el año de la matriculación: ");
                    vehiculo.setAño(teclado.nextInt());
                    teclado.nextLine();

                    // Comprobamos la fecha de matriculacion que sea anterior a la actual
                    if (!metodos_estaticos.comprobar(vehiculo.getDia(), vehiculo.getMes(), vehiculo.getAño())) {
                        System.out.println("ERROR\nLa fecha es posterior a la actual");
                        Borrar(vehiculo);
                        sinDatos = true;
                        break;
                    }

                    sinDatos = false;
                    break;

                // Ver matricula
                case 2:
                    System.out.printf("La matricula es %s\n", vehiculo.getMatricula());
                    break;

                // Ver numero de kilometros
                case 3:
                    System.out.printf("El vehiculo tiene es %d km\n", vehiculo.getNumKM());
                    break;

                // Actualizar km (solo puede ser mayor que los actuales)
                case 4:
                    System.out.print("Digame cuantos km tiene actualmente: ");
                    int actuKM = teclado.nextInt();
                    if (actuKM >= vehiculo.getNumKM()) {
                        vehiculo.setNumKM(actuKM);
                    } else {
                        System.out.println("Es más pequeño");
                    }
                    break;

                // Muestra el tiempo trascurrido desde la matriculacion
                case 5:
                    Vehiculo.añosAnt(vehiculo.getDia(), vehiculo.getMes(), vehiculo.getAño());
                    break;

                // Nombre del propietario con su DNI
                case 6:
                    System.out.printf("El propietario es: %s y su DNI es %s", vehiculo.getPropietario(), vehiculo.getDNI());
                    break;

                // El vehiculo mostrará la descripcion, con su matricula y sus km
                case 7:
                    System.out.printf("El vehiculo con matricula %s y %d km es '%s'\n", vehiculo.getMatricula(), vehiculo.getNumKM(), vehiculo.getDescripcion());
                    break;

                // Mostrará el precio del vehiculo
                case 8:
                    System.out.printf("El precio del vehiculo es de %8.2f €\n \n", vehiculo.getPrecio());
                    break;

                // Finalizará
                case 9:
                    System.out.println("POWER OFF");
                    break;

                default:
                    System.out.println("Opción no reconocida");

            }
        } while (opcion != 9);

    }

    public static void Borrar(Vehiculo vehiculo) {
        vehiculo.setMarca(" ");
        vehiculo.setMatricula(" ");
        vehiculo.setNumKM(0);
        vehiculo.setDNI(" ");
        vehiculo.setDescripcion(" ");
        vehiculo.setPropietario(" ");
        vehiculo.setPrecio(0);
        vehiculo.setDia(1);
        vehiculo.setMes(1);
        vehiculo.setAño(2000);

    }

}
