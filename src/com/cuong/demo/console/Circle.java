package com.cuong.demo.console;

import java.util.Scanner;

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

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập bán kính hình tròn: ");
            float r = sc.nextFloat();

            new Circle(r).showInfo();

            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
