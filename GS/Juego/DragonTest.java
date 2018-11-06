/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
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
public class DragonTest {
    
    public DragonTest() {
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
     * Test of setX method, of class Dragon.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 100;
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        if (x != instance.getX()){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setY method, of class Dragon.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 100;
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        if (y != instance.getY()){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getX method, of class Dragon.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }
        

    /**
     * Test of getY method, of class Dragon.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getVelocidad method, of class Dragon.
     */
    @Test
    public void testGetVelocidad() {
        System.out.println("getVelocidad");
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        int expResult = 2;
        int result = instance.getVelocidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getImage method, of class Dragon.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Dragon instance = new Dragon("Bruno", 50, 135, 2, "Capitan");
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setVisible method, of class Dragon.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = false;
        Dragon instance = new Dragon("Bruno", 50, 135, 2, "Capitan");
        instance.setVisible(visible);
        // TODO review the generated test code and remove the default call to fail.
        if(instance.isVisible() != visible){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of isVisible method, of class Dragon.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Dragon instance = new Dragon("Gabriel", 50, 135, 2, "Infante");
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Dragon.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Dragon instance = new Dragon("Oscar", 2, 455, 1, "Infante");
        String expResult = "Oscar";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Dragon.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Mario";
        Dragon instance = new Dragon("Oscar", 2, 455, 1, "Infante");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        if(name != instance.getName())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getRechargeSpeed method, of class Dragon.
     */
    @Test
    public void testGetRechargeSpeed() {
        System.out.println("getRechargeSpeed");
        Dragon instance = new Dragon("Francisco", 2, 468, 1, "Capitan");
        int expResult = 2;
        int result = instance.getRechargeSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setRechargeSpeed method, of class Dragon.
     */
    @Test
    public void testSetRechargeSpeed() {
        System.out.println("setRechargeSpeed");
        int rechargeSpeed = 5;
        Dragon instance = new Dragon("Francisco", 2, 468, 1, "Capitan");
        instance.setRechargeSpeed(rechargeSpeed);
        // TODO review the generated test code and remove the default call to fail.
        if (rechargeSpeed != instance.getRechargeSpeed())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Dragon.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Dragon instance = new Dragon("Andres", 50, 135, 2, "Capitan");
        int expResult = 135;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != instance.getAge())
            fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Dragon.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 135;
        Dragon instance = new Dragon("Bruno", 50, 135, 2, "Capitan");
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        if (age != instance.getAge())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getResistance method, of class Dragon.
     */
    @Test
    public void testGetResistance() {
        System.out.println("getResistance");
        Dragon instance =  new Dragon("Bruno", 50, 135, 2, "Capitan");
        int expResult = 2;
        int result = instance.getResistance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setResistance method, of class Dragon.
     */
    @Test
    public void testSetResistance() {
        System.out.println("setResistance");
        int resistance = 1;
        Dragon instance = new Dragon("Bruno", 50, 135, 1, "Capitan");
        instance.setResistance(resistance);
        // TODO review the generated test code and remove the default call to fail.
        if (resistance != instance.getResistance())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getClassType method, of class Dragon.
     */
    @Test
    public void testGetClassType() {
        System.out.println("getClassType");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Capitan");
        String expResult = "Capitan";
        String result = instance.getClassType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setClassType method, of class Dragon.
     */
    @Test
    public void testSetClassType() {
        System.out.println("setClassType");
        String classType = "Infante";
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Infante");
        instance.setClassType(classType);
        // TODO review the generated test code and remove the default call to fail.
        if (classType != instance.getClassType()) 
            fail("The test case is a prototype.");
    }

    /**
     * Test of getPadre method, of class Dragon.
     */
    @Test
    public void testGetPadre() {
        System.out.println("getPadre");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Infante");
        Dragon expResult = null;
        Dragon result = instance.getPadre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setPadre method, of class Dragon.
     */
    @Test
    public void testSetPadre() {
        System.out.println("setPadre");
        Dragon padre = new Dragon("Bruno", 50, 135, 1, "Capitan");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Infante");
        instance.setPadre(padre);
        // TODO review the generated test code and remove the default call to fail.
        if (instance != instance.getPadre())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getHijo1 method, of class Dragon.
     */
    @Test
    public void testGetHijo1() {
        System.out.println("getHijo1");
        Dragon instance = new Dragon("Bruno", 55, 100, 2, "Infante");
        Dragon expResult = null;
        Dragon result = instance.getHijo1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setHijo1 method, of class Dragon.
     */
    @Test
    public void testSetHijo1() {
        System.out.println("setHijo1");
        Dragon hijo1 = new Dragon("Bruno", 50, 135, 1, "Capitan");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Capitan");
        instance.setHijo1(hijo1);
    }

    /**
     * Test of getHijo2 method, of class Dragon.
     */
    @Test
    public void testGetHijo2() {
        System.out.println("getHijo2");
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Capitan");
        Dragon expResult = new Dragon("Fabian", 50, 135, 1, "Infante");
        Dragon result = instance.getHijo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setHijo2 method, of class Dragon.
     */
    @Test
    public void testSetHijo2() {
        System.out.println("setHijo2");
        Dragon hijo2 = new Dragon("Bruno", 50, 135, 2, "Capitan");
        Dragon instance = new Dragon("Gabriel", 50, 135, 2, "Infante");
        instance.setHijo2(hijo2);
    }

    /**
     * Test of getNext method, of class Dragon.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Dragon instance = new Dragon("Gabriel", 50, 135, 2, "Infante");
        Dragon expResult = null;
        Dragon result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class Dragon.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Dragon next = new Dragon("Gabriel", 50, 135, 2, "Infante");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Capitan");
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        if (next != instance.getNext())
            fail("The test case is a prototype.");
    }

    /**
     * Test of getPrev method, of class Dragon.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Capitan");
        Dragon expResult = null;
        Dragon result = instance.getPrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }

    /**
     * Test of setPrev method, of class Dragon.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev");
        Dragon prev = new Dragon("Fabian", 50, 135, 1, "Capitan");
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        instance.setPrev(prev);
        // TODO review the generated test code and remove the default call to fail.
        if (prev != instance.getPrev());
            fail("The test case is a prototype.");
    }

    /**
     * Test of generateCoords method, of class Dragon.
     */
    @Test
    public void testGenerateCoords() {
        System.out.println("generateCoords");
        int i = 0;
        Dragon instance = new Dragon("Antonio", 2, 455, 1, "Infante");
        instance.generateCoords(i);
        
    }

    /**
     * Test of logic method, of class Dragon.
     */
    @Test
    public void testLogic() {
        System.out.println("logic");
        Dragon instance = new Dragon("Fabian", 50, 135, 1, "Capitan");
        instance.logic();
        // TODO review the generated test code and remove the default call to fail.
        if ((instance.getX()<0) || (instance.getX()>795))
            if((instance.getY()<0) || (instance.getY()>370))
                fail("The test case is a prototype.");
    }

}
