/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional_isaacredouan;

/**
 *
 * @author isaac
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {

        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {

        if (denominador == 0) {
            denominador = 1;
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {

        if (denominador == 0) {

            denominador = 1;
        }
        
        this.denominador = denominador;
    }

    public void imprimirConsola() {

        System.out.println("Número racional " + numerador
                + "/" + denominador);
    }
}
