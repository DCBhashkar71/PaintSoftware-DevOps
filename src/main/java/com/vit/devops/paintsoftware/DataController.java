/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class DataController {
    private String data;

    public DataController() { this.data = ""; }

    public void setData(String data) { this.data = data; }
    public String getData()           { return data; }

    public void processData() {
        System.out.println("DataController processing: " + data);
    }
}