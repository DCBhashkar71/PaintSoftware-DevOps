/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class DialogBox extends Window {
    private DataController dataController;

    public DialogBox(String title, int width, int height) {
        super(title, width, height);
        this.dataController = new DataController();
    }

    public DataController getDataController() { return dataController; }

    public void showDialog(String message) {
        System.out.println("[Dialog '" + getTitle() + "'] " + message);
        dataController.setData(message);
        dataController.processData();
    }
}
