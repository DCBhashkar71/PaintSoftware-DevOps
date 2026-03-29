/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;



public class DrawingContext extends Window {
    private int verticalSize;
    private int horizontalSize;
    private Point currentPoint;

    public DrawingContext(String title, int width, int height) {
        super(title, width, height);
        this.verticalSize   = height;
        this.horizontalSize = width;
    }

    public void setPoint(Point p) {
        this.currentPoint = p;
        System.out.println("DrawingContext point set to " + p);
    }

    public void clearScreen() {
        System.out.println("DrawingContext: screen cleared.");
    }

    public int getVerticalSize()   { return verticalSize; }
    public int getHorizontalSize() { return horizontalSize; }
    public Point getCurrentPoint() { return currentPoint; }
}