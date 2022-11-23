package com.cuong.demo.console;

public class Triangle implements Shape {
    private boolean isTriangle = false;
    private float a, b, c;

    public Triangle() {

    }

    public Triangle(float a, float b, float c) {

        if (a + b > c && a + c > b && b + c > a) {
            isTriangle = true;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public void showInfo() {
        if (isTriangle) {
            System.out.println("Hình tam giác");
            System.out.println("\tĐộ dài cạnh a: " + a);
            System.out.println("\tĐộ dài cạnh b: " + b);
            System.out.println("\tĐộ dài cạnh c: " + c);
            System.out.println("\tDiện tích: " + getArea());
            System.out.println("\tChu vi: " + getCircuit());
        } else {
            System.out.println("không phải hình tam giác!");
        }
    }

    @Override
    public void draw() {

    }

    @Override
    public float getArea() {
        float p = getCircuit() / (float) 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public float getCircuit() {
        return a + b + c;
    }

}
