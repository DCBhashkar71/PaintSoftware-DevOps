/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.paintsoftware;


public class Event {
    private String eventType;
    private long timestamp;

    public Event(String eventType) {
        this.eventType = eventType;
        this.timestamp = System.currentTimeMillis();
    }

    public String getEventType() { return eventType; }
    public long getTimestamp()   { return timestamp; }

    @Override
    public String toString() {
        return "Event[" + eventType + " @ " + timestamp + "]";
    }
}
