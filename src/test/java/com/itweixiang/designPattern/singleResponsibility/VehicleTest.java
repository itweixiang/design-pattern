package com.itweixiang.designPattern.singleResponsibility;

import org.junit.Test;

/**
 * 单一职责原则
 * <p>
 * 作用：
 * 1、降低单个类的复杂度
 * 2、提高类的可读性、可维护性
 * 3、降低变更风险
 * <p>
 * 只有在逻辑足够简单的情况下才可以违反单一职责原则
 */
public class VehicleTest {


    /**
     * 错误：飞机和游艇不能再公路上跑
     */
    @Test
    public void testRun1() {
        WrongVehicle vehicle = new WrongVehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("游艇");
    }

    /**
     * 不同的类对应不同的交通工具
     * 遵守了单一职责原则，但是过于繁琐
     */
    @Test
    public void testRun2() {
        Vehicle airplane = new AirVehicle();
        Vehicle car = new RoadVehicle();
        airplane.run("飞机");
        car.run("汽车");
    }

    /**
     * 在单个类中用多个方法实现单一职责原则，每个方法对应不同的交通工具
     */
    @Test
    public void testRun3() {
        SynthesizeVehicle vehicle = new SynthesizeVehicle();
        vehicle.airRun("飞机");
        vehicle.roadRun("汽车");
    }
}
