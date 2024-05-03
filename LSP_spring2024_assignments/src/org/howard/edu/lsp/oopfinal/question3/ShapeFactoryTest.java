package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Shape;

import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
//Testing the code
    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("Circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateInvalidShape() {
        Shape invalidShape = ShapeFactory.createShape("Octagon");
        assertNull(invalidShape);
    }
}