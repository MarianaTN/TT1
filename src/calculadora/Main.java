/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author marit
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma :" + calc.soma(4, 6));
        System.out.println("Subtração: " + calc.subtracao(6, 4));
        System.out.println("Multiplicação: " + calc.multiplicacao(4, 6));
        System.out.println("Divisão: " + calc.divisao(4, 2));
    }
}
