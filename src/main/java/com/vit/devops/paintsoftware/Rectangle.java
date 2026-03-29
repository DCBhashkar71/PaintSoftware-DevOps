/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class Rectangle extends Shape {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft     = topLeft;
        this.bottomRight = bottomRight;
    }

    public double area() {
        int width  = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }

    public Point getTopLeft()     { return topLeft; }
    public Point getBottomRight() { return bottomRight; }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle from " + topLeft + " to " + bottomRight);
    }

    @Override
    public void erase()  { System.out.println("Erasing Rectangle"); }

    @Override
    public void move()   { System.out.println("Moving Rectangle"); }

    @Override
    public void resize() { System.out.println("Resizing Rectangle"); }
}