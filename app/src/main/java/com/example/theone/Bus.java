package com.example.theone;

public class Bus {

    private static String busName;
    private static int busId;
    private static String busFrom;
    private static String busTo;
    private static int busDate;
    private static int busSeat;


    //Constructors
    public Bus(String busName, int busId, String busFrom, String busTo, int busDate,int busSeat) {
        this.busName = busName;
        this.busId = busId;
        this.busFrom = busFrom;
        this.busTo = busTo;
        this.busDate = busDate;
        this.busSeat = busSeat;

    }

    //Getters


    public static String getBusName() {
        return busName;
    }

    public static int getBusId() {
        return busId;
    }

    public static String getBusFrom() {
        return busFrom;
    }

    public static String getBusTo() {
        return busTo;
    }

    public static int getBusDate() {
        return busDate;
    }

    public static int getBusSeat(){
        return busSeat;
    }
}
