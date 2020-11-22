/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.font.TextAttribute;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class SVGTextFigureTest {
    
    public SVGTextFigureTest() {
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
     * Test of getTextShape method, of class SVGTextFigure.
     */
    @Test
    public void getTextShapeTest() {
        SVGTextFigure svg = new SVGTextFigure();
        assertNotNull(svg);
        assertTrue(TextAttribute.FONT.UNDERLINE_ON == 0);
    }
}
