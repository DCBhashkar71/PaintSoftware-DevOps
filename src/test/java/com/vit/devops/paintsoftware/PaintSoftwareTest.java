/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PaintSoftwareTest {

    // ── TC01: Circle area ──────────────────────────────────────────────
    @Test
    @DisplayName("TC01 - Circle area should equal PI * r squared")
    void testCircleArea() {
        Circle c = new Circle(5.0f, 0);
        double expected = Math.PI * 5 * 5;
        assertEquals(expected, c.area(5.0f), 0.0001,
                     "Circle area formula incorrect");
    }

    // ── TC02: Circle circumference ─────────────────────────────────────
    @Test
    @DisplayName("TC02 - Circle circumference should equal 2 * PI * r")
    void testCircleCircumference() {
        Circle c = new Circle(7.0f, 0);
        double expected = 2 * Math.PI * 7;
        assertEquals(expected, c.circumference(), 0.0001,
                     "Circumference formula incorrect");
    }

    // ── TC03: Rectangle area ───────────────────────────────────────────
    @Test
    @DisplayName("TC03 - Rectangle area should equal width x height")
    void testRectangleArea() {
        Rectangle r = new Rectangle(
                          new Point(0, 0),
                          new Point(10, 5));
        assertEquals(50.0, r.area(), 0.0001,
                     "Rectangle area should be 50");
    }

    // ── TC04: Circle setRadius ─────────────────────────────────────────
    @Test
    @DisplayName("TC04 - setRadius should update Circle radius")
    void testCircleSetRadius() {
        Circle c = new Circle(3.0f, 1);
        c.setRadius(10.0f);
        assertEquals(10.0f, c.getRadius(), 0.001,
                     "Radius not updated by setRadius()");
    }

    // ── TC05: Window open and close ────────────────────────────────────
    @Test
    @DisplayName("TC05 - Window should track open and close state")
    void testWindowOpenCloseState() {
        Window w = new Window("Test", 800, 600);
        assertFalse(w.isOpen(), "Window should initially be closed");
        w.open();
        assertTrue(w.isOpen(),  "Window should be open after open()");
        w.close();
        assertFalse(w.isOpen(), "Window should be closed after close()");
    }

    // ── TC06: Polygon vertices ─────────────────────────────────────────
    @Test
    @DisplayName("TC06 - Polygon should store all added vertices")
    void testPolygonVertices() {
        Polygon p = new Polygon();
        p.addVertex(new Point(0, 0));
        p.addVertex(new Point(5, 0));
        p.addVertex(new Point(2, 4));
        assertEquals(3, p.getVertices().size(),
                     "Polygon should have 3 vertices");
    }

    // ── TC07: DataController roundtrip ────────────────────────────────
    @Test
    @DisplayName("TC07 - DataController setData and getData roundtrip")
    void testDataControllerRoundtrip() {
        DataController dc = new DataController();
        dc.setData("HelloVIT");
        assertEquals("HelloVIT", dc.getData(),
                     "DataController did not return stored data");
    }

    // ── TC08: DrawingContext setPoint ──────────────────────────────────
    @Test
    @DisplayName("TC08 - DrawingContext setPoint should store coordinates")
    void testDrawingContextSetPoint() {
        DrawingContext dctx = new DrawingContext("Canvas", 800, 600);
        Point p = new Point(42, 99);
        dctx.setPoint(p);
        assertNotNull(dctx.getCurrentPoint(),
                      "Point should not be null after setPoint");
        assertEquals(42, dctx.getCurrentPoint().getX(),
                     "X coordinate mismatch");
        assertEquals(99, dctx.getCurrentPoint().getY(),
                     "Y coordinate mismatch");
    }
}
