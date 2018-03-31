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
public class Calculadora {

    private int i,j;
    public int soma(int i, int j){
        return i+j;
    }
    public int subtracao(int i, int j){
        return i-j;
    }
    public double divisao(int i, int j){
        if(j != 0){
            return i/j;
        }
        return 0;
    }
    public int multiplicacao(int i,int j){
        return i*j;
    }
}
