/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package concursonumeros;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hugog
 */
public class CONCURSONUMEROSTest {
    
    public CONCURSONUMEROSTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of iniciarConcurso method, of class CONCURSONUMEROS.
     */
    @Test
    public void testIniciarConcurso() {
        System.out.println("iniciarConcurso");
        CONCURSONUMEROS.iniciarConcurso();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of njugNoValido method, of class CONCURSONUMEROS.
     */
    @Test
    public void testNjugNoValido() {
        System.out.println("njugNoValido");
        CONCURSONUMEROS.njugNoValido();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nrondNoValido method, of class CONCURSONUMEROS.
     */
    @Test
    public void testNrondNoValido() {
        System.out.println("nrondNoValido");
        CONCURSONUMEROS.nrondNoValido();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pregunta method, of class CONCURSONUMEROS.
     */
    @Test
    public void testPregunta() {
        System.out.println("pregunta");
        CONCURSONUMEROS.pregunta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluarExpresionArray method, of class CONCURSONUMEROS.
     */
    @Test
    public void testEvaluarExpresionArray() {
        System.out.println("evaluarExpresionArray");
        String[] exp = null;
        int expResult = 0;
        int result = CONCURSONUMEROS.evaluarExpresionArray(exp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CONCURSONUMEROS.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CONCURSONUMEROS.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
