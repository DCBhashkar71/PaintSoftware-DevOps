/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;



import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {
    private List<Point> vertices;

    public Polygon() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Point p) { vertices.add(p); }
    public List<Point> getVertices() { return vertices; }

    @Override
    public void draw() {
        System.out.println("Drawing Polygon with " + vertices.size() + " vertices");
    }

    @Override
    public void erase()  { System.out.println("Erasing Polygon"); }

    @Override
    public void move()   { System.out.println("Moving Polygon"); }

    @Override
    public void resize() { System.out.println("Resizing Polygon"); }
}