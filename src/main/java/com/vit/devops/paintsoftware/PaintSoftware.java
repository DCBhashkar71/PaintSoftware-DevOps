/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vit.devops.paintsoftware;

public class PaintSoftware {
    public static void main(String[] args) {

        // ── Drawing Context ──────────────────────────────────
        DrawingContext dc = new DrawingContext("Paint Canvas", 800, 600);
        dc.open();
        dc.setPoint(new Point(100, 150));

        // ── Create Shapes ─────────────────────────────────────
        Circle    circle = new Circle(50.0f, 1);
        Rectangle rect   = new Rectangle(new Point(10, 10), new Point(110, 60));
        Polygon   poly   = new Polygon();
        poly.addVertex(new Point(200, 100));
        poly.addVertex(new Point(250, 200));
        poly.addVertex(new Point(150, 200));

        // ── Add and Display ───────────────────────────────────
        dc.addShape(circle);
        dc.addShape(rect);
        dc.addShape(poly);
        dc.display();
        System.out.println("\nCircle area (r=50)   : " + circle.area(50.0f));
        System.out.println("Circle circumference : " + circle.circumference());
        System.out.println("Rectangle area       : " + rect.area());

        // ── Event Handling ────────────────────────────────────
        Event clickEvent = new Event("MOUSE_CLICK");
        dc.handleEvent(clickEvent);

        // ── Dialog Box ────────────────────────────────────────
        DialogBox dialog = new DialogBox("Save File", 300, 150);
        dialog.open();
        dialog.showDialog("File saved successfully!");
        dialog.close();

        // ── Console Window ────────────────────────────────────
        ConsoleWindow console = new ConsoleWindow("Output Console", 400, 200);
        console.open();
        console.printMessage("Paint Software started.");

        // ── Cleanup ───────────────────────────────────────────
        dc.clearScreen();
        dc.close();
        }
}
