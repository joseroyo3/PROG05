/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import java.time.LocalDate;
import java.time.Period;

/**
 * Class Vehiculo
 *
 * @author Jose royo
 */
public class Vehiculo {

    // Declaramos variables 
    private String marca, matricula, descripcion, propietario, DNI;
    private int numKM;
    private float precio;
    private int dia, mes, año;

// Constructores
    // Void constructor
    public Vehiculo() {
        marca = "";
        matricula = "";
        numKM = 0;
        descripcion = "";
        propietario = "";
        DNI = "";
        precio = 0;
        dia = 1;
        mes = 1;
        año = 2000;
    }

    // Constructor
    public Vehiculo(String marca, String matricula, int numKM, int dia, int mes, int año, String descripcion, String propietario, String DNI, float precio) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKM = numKM;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.descripcion = descripcion;
        this.propietario = propietario;
        this.DNI = DNI;
        this.precio = precio;
    }

// Getter / Setter
    // Get/Set de Marca del coche
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Get/Set de la Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Get/Set de Número de KM del vehiculo
    public int getNumKM() {
        return numKM;
    }

    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    // Get/Set de la fecha que se matriculó
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Get/Set de la descripción del vehiculo
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Get/Set del propietario del vehiculo
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    // Get/Set del DNI del propietario
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // Get/Set del Precio del vehiculo
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Opción 5, calcula la diferencia de meses entre el año de matriculacion y hoy
    public static void añosAnt(int dia, int mes, int año) {
        LocalDate fechaMatric = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();;
        Period desdeMatric = Period.between(fechaMatric, hoy);
        float total = desdeMatric.toTotalMonths();
        System.out.printf("Han pasado %4.0f años, %2.0f meses\n", total / 12, total % 12);
    }

}
