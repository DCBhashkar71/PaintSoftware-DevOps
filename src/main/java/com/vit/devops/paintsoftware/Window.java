/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


import java.util.ArrayList;
import java.util.List;

public class Window extends Frame {
    private List<Shape> shapes;
    private boolean isOpen;

    public Window(String title, int width, int height) {
        super(title, width, height);
        this.shapes = new ArrayList<>();
        this.isOpen = false;
    }

    public void open() {
        isOpen = true;
        System.out.println("Window '" + getTitle() + "' opened.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Window '" + getTitle() + "' closed.");
    }

    public void move() {
        System.out.println("Window '" + getTitle() + "' moved.");
    }

    public void display() {
        System.out.println("Displaying: " + getTitle()
            + " [" + getWidth() + "x" + getHeight() + "]");
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public void handleEvent(Event e) {
        System.out.println("Window handling: " + e);
    }

    public void addShape(Shape s)    { shapes.add(s); }
    public List<Shape> getShapes()   { return shapes; }
    public boolean isOpen()          { return isOpen; }
}