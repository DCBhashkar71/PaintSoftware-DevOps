/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class ConsoleWindow extends Window {

    public ConsoleWindow(String title, int width, int height) {
        super(title, width, height);
    }

    public void printMessage(String msg) {
        System.out.println("[Console] " + msg);
    }
}