package com.cuong.demo.console;

import java.util.Scanner;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(float edge) {
        super(edge, edge);
        name = "Hình vuông";
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài cạnh hình vuông: ");
            float a = sc.nextFloat();

            new Square(a).showInfo();

            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
