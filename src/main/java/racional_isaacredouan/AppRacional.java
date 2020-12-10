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
        Racional racional1 = new Racional(5, 6);
        Racional racional2 = new Racional(5, 6);

        //**
        //Racional 1
        //racional1.setNumerador(5);
        //racional1.setDenominador(6);
        //Racional 2
        //racional2.setNumerador(5);
        //racional2.setDenominador(7);
        Racional operacion = new Racional();

        System.out.println("Suma:");
        System.out.print(racional1.toString() + " + " + racional2.toString() + " = ");
        operacion.Suma(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        System.out.println("Resta:");
        System.out.print(racional1.toString() + " - " + racional2.toString() + " = ");
        operacion.Resta(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");

        System.out.println("Multiplicación:");
        System.out.print(racional1.toString() + " * " + racional2.toString() + " = ");
        operacion.Multiplicar(racional1.getNumerador(), racional1.getDenominador(),
                racional2.getNumerador(), racional2.getDenominador());
        System.out.println("");
    }
}
