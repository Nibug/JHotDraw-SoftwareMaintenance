/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import javax.swing.Action;
import org.jhotdraw.draw.ConnectionFigure;
import org.jhotdraw.draw.Connector;
import org.jhotdraw.draw.Handle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RasmusThomsen
 */
public class SVGImageFigureTest {
    SVGImageFigure sif;
    
    public SVGImageFigureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    sif = new SVGImageFigure(1,2,10,15);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getX method, of class SVGImageFigure.
     */
    @Test
    public void testGetX() {
        double expResult = 1;
        double result = sif.getX();
        assertEquals(expResult,result,0.0);
    }

    /**
     * Test of getY method, of class SVGImageFigure.
     */
    @Test
    public void testGetY() {
        double expResult = 2;
        double result = sif.getY();
        assertEquals(expResult,result,0.0);
    }

    /**
     * Test of getWidth method, of class SVGImageFigure.
     */
    @Test
    public void testGetWidth() {
        double expResult = 10;
        double result = sif.getWidth();
        assertEquals(expResult,result,0.0);
    }

    /**
     * Test of getHeight method, of class SVGImageFigure.
     */
    @Test
    public void testGetHeight() {
        double expResult = 15;
        double result = sif.getHeight();
        assertEquals(expResult,result,0.0);
    }


    @Test
    public void testGetBufferedImage() {
        BufferedImage expResult = null;
        BufferedImage result = sif.getBufferedImage();
        assertEquals(expResult,result);
    }

    /**
     * Test of loadImage method, of class SVGImageFigure.
     */
    @Test
    public void testLoadImage_File() throws Exception {
        String path = "src/test/Ressources/ER.jpg"; 
	File file = new File(path);
        file = new File(file.getAbsolutePath());
        
      
        SVGImageFigure instance = new SVGImageFigure();
        instance.loadImage(file);
        //We here assert that the image has succesfully been set in the SVGImageFigure object.
        assertNotNull(instance.getImageData());
        
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of loadImage method, of class SVGImageFigure.
     */
//    @Test
//    public void testLoadImage_InputStream() throws Exception {
//        System.out.println("loadImage");
//        InputStream in = null;
//        SVGImageFigure instance = new SVGImageFigure();
//        instance.loadImage(in);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
