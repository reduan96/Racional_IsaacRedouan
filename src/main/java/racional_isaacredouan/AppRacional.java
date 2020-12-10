/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional_isaacredouan;

import java.util.Scanner;

/**
 *
 * @author reduan
 */
public class AppRacional {

    public static void main(String[] args) {

        //Se pueden indicar los valores tanto en el constructor parametrizado
        //**como en sus respectivos setters
        Racional racional1 = new Racional(1, 6);
        Racional racional2 = new Racional(1, 6);

        //**
        //Racional 1
        //racional1.setNumerador(5);
        //racional1.setDenominador(6);
        //Racional 2
        //racional2.setNumerador(5);
        //racional2.setDenominador(7);
        //Creación del objeto para realizar la llamada de los métodos de las
        //operaciones indicadas
        Racional operacion = new Racional();

        //Prueba del funcionamiento del método suma
        System.out.println("Suma:");
        System.out.print(racional1.toString() + " + " + racional2.toString() + " = ");
        operacion.Suma(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        //Prueba del funcionamiento del método resta
        System.out.println("Resta:");
        System.out.print(racional1.toString() + " - " + racional2.toString() + " = ");
        operacion.Resta(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        //Prueba del funcionamiento del método multiplicación
        System.out.println("Multiplicación:");
        System.out.print(racional1.toString() + " * " + racional2.toString() + " = ");
        operacion.Multiplicar(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        //Prueba del funcionamiento del método dividir
        System.out.println("División:");
        System.out.print(racional1.toString() + " / " + racional2.toString() + " = ");
        operacion.Dividir(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        //Prueba del funcionamiento del método Igualdad
        System.out.println("Igualar:");
        System.out.print(racional1.toString() + " ?= " + racional2.toString() + " = ");
        operacion.Igualdad(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        //Prueba del funcionamiento del método aleatorio
        System.out.println("Aleatorio:");
        operacion.Aleatorio();

        System.out.println("-----------------------------");
        System.out.println("Pruebas dictadas del ejercicio");
        //A
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        //B
        System.out.println("Aleatorio:");
        operacion.Aleatorio();
    }
}
