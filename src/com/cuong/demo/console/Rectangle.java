package com.cuong.demo.console;

public class Rectangle {
    protected String name = "Hình chữ nhật";
    private int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println("\tChiều rộng: " + width);
        System.out.println("\tChiều dài: " + length);
        System.out.println("\tDiện tích: " + getArea());
        System.out.println("\tChu vi: " + getCircuit());

        draw();

    }

    public void draw() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int getArea() {
        return width * length;
    }

    public int getCircuit() {
        return 2 * (width + length);
    }
}
