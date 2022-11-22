package com.cuong.demo.console;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private float a, b, c;

    private void resolve() {
        System.out.println(a + "x^2" + (b > 0 ? " + " : " - ") + Math.abs(b) + ("x") + (c > 0 ? " + " : " - ") + Math.abs(c) + " = 0");
        System.out.println("Nghiệm của phương trình:");
        float delta = b * b - 4 * a * c;
        if (delta < 0) System.out.println("Phương trình vô nghiệm!");
        else if (delta == 0) {
            System.out.println("Phương trình có 2 nghiệm kép:");
            System.out.println("x1 = x2 = " + (-b / (2 * a)));
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Phương trình bậc hai có dạng: ax^2+bx+c=0");
            System.out.print("Nhập a = ");
            this.a = sc.nextFloat();
            System.out.print("Nhập b = ");
            this.b = sc.nextFloat();
            System.out.print("Nhập c = ");
            this.c = sc.nextFloat();
            resolve();
            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
