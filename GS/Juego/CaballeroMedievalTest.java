/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Rectangle;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan
 */
public class CaballeroMedievalTest {
    
    public CaballeroMedievalTest() {
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
     * Test of getX method, of class CaballeroMedieval.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        CaballeroMedieval instance = new CaballeroMedieval();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class CaballeroMedieval.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        CaballeroMedieval instance = new CaballeroMedieval();
        int expResult = 250;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of getfuego method, of class CaballeroMedieval.
     */
    @Test
    public void testGetfuego() {
        System.out.println("getfuego");
        CaballeroMedieval instance = new CaballeroMedieval();
        ArrayList expResult = null;
        ArrayList result = instance.getfuego();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of logic method, of class CaballeroMedieval.
     */
    @Test
    public void testLogic() {
        System.out.println("logic");
        CaballeroMedieval instance = new CaballeroMedieval();
        instance.logic();
        // TODO review the generated test code and remove the default call to fail.
        if((instance.getY()<0) || (instance.getY()<550))
            if((instance.getX()>0) || (instance.getX()>695))
                fail("The test case is a prototype.");
    }
    
}
