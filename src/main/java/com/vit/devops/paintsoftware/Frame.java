/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class Frame {
    private int width;
    private int height;
    private String title;

    public Frame(String title, int width, int height) {
        this.title  = title;
        this.width  = width;
        this.height = height;
    }

    public int getWidth()    { return width; }
    public int getHeight()   { return height; }
    public String getTitle() { return title; }
}