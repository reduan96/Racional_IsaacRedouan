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

    public void Suma(int numerador1, int denominador1, int numerador2, int denominador2) {
        int resultado;
        if (denominador1 == denominador2) {
            resultado = numerador1 + numerador2;
            System.out.println(resultado + "/" + denominador1);

        } else {
            resultado = ((numerador1 * denominador2) + (denominador1 * numerador2));
            System.out.println(resultado + "/" + (denominador1 * denominador2));
        }

    }

    public void Resta(int numerador1, int denominador1, int numerador2, int denominador2) {

        int resultado;
        if (denominador1 == denominador2) {
            resultado = numerador1 - numerador2;
            System.out.println(resultado + "/" + denominador1);
        } else {
            resultado = ((numerador1 * denominador2) - (denominador1 * numerador2));
            System.out.println(resultado + "/" + (denominador1 * denominador2));
        }
    }

    public void Multiplicar(int numerador1, int denominador1, int numerador2, int denominador2) {

        int resultado1, resultado2;
        resultado1 = numerador1 * numerador2;
        resultado2 = denominador1 * denominador2;
        System.out.println(resultado1 + "/" + resultado2);
    }
    
    public void Dividir(int numerador1, int denominador1, int numerador2, int denominador2) {

        int resultado1, resultado2;
        resultado1 = numerador1 * denominador2;
        resultado2 = numerador2 * denominador1;
        System.out.println(resultado1 + "/" + resultado2);
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

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
