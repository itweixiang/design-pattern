package com.itweixiang.designPattern.singleResponsibility;

public class RoadVehicle implements Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}
