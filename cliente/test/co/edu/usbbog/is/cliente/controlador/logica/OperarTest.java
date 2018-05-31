/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.controlador.logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 204
 */
public class OperarTest {
    
    public OperarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iniciarSesion method, of class Operar.
     */
   /*@Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        String user = "";
        String pass = "";
        Operar instance = new Operar();
        boolean expResult = false;
        boolean result = instance.iniciarSesion(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of cerrarSesion method, of class Operar.
     */
   /* @Test
    public void testCerrarSesion() {
        System.out.println("cerrarSesion");
        Operar instance = new Operar();
        instance.cerrarSesion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of operacion method, of class Operar.
     */
    @Test
    public void testOperacion() {
        System.out.println("operacion");
        String ecuacion = "a + c =";
        Operar instance = new Operar();
        String expResult = "1003.0";
        String result = instance.operacion(ecuacion);
        if(!expResult.equals(result)){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sumar method, of class Operar.
     */
    /*@Test
    public void testSumar() {
        System.out.println("sumar");
        String num1 = "";
        String num2 = "";
        Operar instance = new Operar();
        String expResult = "";
        String result = instance.sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
