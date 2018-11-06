/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

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
public class VentanaTest {
    
    public VentanaTest() {
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
     * Test of getCantDragones method, of class Ventana.
     */
    @Test
    public void testGetCantDragones() {
        System.out.println("getCantDragones");
        int expResult = 6;
        int result = Ventana.getCantDragones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCantDragones method, of class Ventana.
     */
    @Test
    public void testSetCantDragones() {
        System.out.println("setCantDragones");
        int cantDragones = 6;
        Ventana.setCantDragones(cantDragones);
        // TODO review the generated test code and remove the default call to fail.
        if (Ventana.getCantDragones() != cantDragones){
            fail("The test case is a prototype.");
        }
    }


    /**
     * Test of levelUp method, of class Ventana.
     */
    @Test
    public void testLevelUp() {
        System.out.println("levelUp");
        Ventana instance = new Ventana();
        instance.levelUp();
        // TODO review the generated test code and remove the default call to fail.
        if(Ventana.getCantDragones() == 0){
            fail("The test case is a prototype.");
        }    
    }

    /**
     * Test of gameOver method, of class Ventana.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        int status = 0;
        Ventana instance = new Ventana();
        instance.gameOver(status);
        // TODO review the generated test code and remove the default call to fail.
        if (status != instance.getComponentCount()){
            fail("The test case is a prototype.");
        }
    }
    
}
