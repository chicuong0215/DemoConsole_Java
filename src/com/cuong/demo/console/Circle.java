package com.cuong.demo.console;

public class Circle implements Shape {
    protected String name = "Hình tròn";
    private float r;

    public Circle() {

    }

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public void showInfo() {
        System.out.println(name);
        System.out.println("\tBán kính: " + r);
        System.out.println("\tDiện tích: " + getArea());
        System.out.println("\tChu vi: " + getCircuit());

        draw();
    }

    @Override
    public void draw() {

    }

    @Override
    public float getArea() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float getCircuit() {
        return (float) (2 * Math.PI * r);
    }
}
