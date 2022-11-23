package com.cuong.demo.console;

public class Rectangle implements Shape {
    protected String name = "Hình chữ nhật";
    private float width;
    private float length;

    public Rectangle() {
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void showInfo() {
        System.out.println(name);
        System.out.println("\tChiều rộng: " + width);
        System.out.println("\tChiều dài: " + length);
        System.out.println("\tDiện tích: " + getArea());
        System.out.println("\tChu vi: " + getCircuit());

        draw();

    }

    @Override
    public void draw() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public float getArea() {
        return width * length;
    }

    @Override
    public float getCircuit() {
        return 2 * (width + length);
    }
}
