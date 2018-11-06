/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Graphics;
import java.awt.Image;
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
public class LayoutTest {
    
    public LayoutTest() {
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
     * Test of getX method, of class Layout.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Layout instance = new Layout();
        int expResult = 1045;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.}
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getY method, of class Layout.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Layout instance = new Layout();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getImage method, of class Layout.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Layout instance = new Layout();
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }
    
}
