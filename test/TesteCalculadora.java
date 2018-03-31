/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marit
 */
public class TesteCalculadora {
    @Test
    public void TesteCalculadora(){
        Calculadora c = new Calculadora();
        int result = c.soma(4,5);
        assertEquals(9,result);
    }
    @Test
    public void TesteSub(){
        Calculadora c = new Calculadora();
        int result = c.subtracao(6,4);
        assertEquals(2,result);
    }
    @Test
    public void TesteMult(){
        Calculadora c = new Calculadora();
        int result = c.multiplicacao(6,3);
        assertEquals(18,result);
        
    }
}
