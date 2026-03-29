/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class Circle extends Shape {
    private float radius;
    private int center;

    public Circle(float radius, int center) {
        this.radius = radius;
        this.center = center;
    }

    public double area(float r) {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(int center) { this.center = center; }
    public void setRadius(float radius) { this.radius = radius; }
    public float getRadius() { return radius; }
    public int getCenter()   { return center; }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: radius=" + radius + ", center=" + center);
    }

    @Override
    public void erase()  { System.out.println("Erasing Circle"); }

    @Override
    public void move()   { System.out.println("Moving Circle"); }

    @Override
    public void resize() { System.out.println("Resizing Circle"); }
}