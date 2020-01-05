package com.itweixiang.designPattern.singleResponsibility;

public class AirVehicle implements Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle+"在天上飞");
    }
}
