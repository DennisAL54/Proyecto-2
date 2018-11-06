/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
import java.awt.Rectangle;
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
public class FuegoTest {
    
    public FuegoTest() {
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
     * Test of getX method, of class Fuego.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Fuego instance = new Fuego(0, 50);
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result < expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Fuego.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Fuego instance = new Fuego(0, 50);
        int expResult = 50;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result < expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Fuego.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Fuego instance = new Fuego(0, 50);
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class Fuego.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = true;
        Fuego instance = new Fuego(0, 50);
        instance.setVisible(visible);
        // TODO review the generated test code and remove the default call to fail.
        if (visible != instance.isVisible())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getLimites method, of class Fuego.
     */
    @Test
    public void testGetLimites() {
        System.out.println("getLimites");
        Fuego instance = new Fuego(0, 50);
        Rectangle expResult = instance.getLimites();
        Rectangle result = instance.getLimites();
        assertEquals(expResult, result);
    }


    /**
     * Test of update method, of class Fuego.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Fuego instance = new Fuego(0, 50);
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getX() > 10)
            fail("The test case is a prototype.");
    }
    
}
