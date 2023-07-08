/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ShuKalx
 */
public class ActividadesIT {

    public ActividadesIT() {
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
     * Test of getCodac method, of class Actividades.
     */
    @Test
    public void testGetCodac() {
        System.out.println("Prueba del metodo getCodac");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getCodac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance = new Actividades ("GC001", "Balada", "C","c","cc");
        assertEquals("GC001", instance.getCodac());

        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodac method, of class Actividades.
     */
    @Test
    public void testSetCodac() {
        System.out.println("setCodac");
        String codac = "";
        Actividades instance = new Actividades();
        instance.setCodac(codac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Actividades.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Actividades.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Actividades instance = new Actividades();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDes method, of class Actividades.
     */
    @Test
    public void testGetDes() {
        System.out.println("getDes");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getDes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDes method, of class Actividades.
     */
    @Test
    public void testSetDes() {
        System.out.println("setDes");
        String des = "";
        Actividades instance = new Actividades();
        instance.setDes(des);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDia method, of class Actividades.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getDia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDia method, of class Actividades.
     */
    @Test
    public void testSetDia() {
        System.out.println("setDia");
        String dia = "";
        Actividades instance = new Actividades();
        instance.setDia(dia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Actividades.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Actividades.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Actividades instance = new Actividades();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
