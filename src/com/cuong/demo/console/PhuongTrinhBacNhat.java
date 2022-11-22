package com.cuong.demo.console;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    private float a, b;

    private void resolve() {
        System.out.println(a + "x" + (b > 0 ? " + " : " - ") + Math.abs(b) + " = 0");
        System.out.println("Nghiệm của phương trình:");
        if (a != 0) {
            if (b == 0) System.out.println("x = 0");
            if (b != 0) System.out.println("x = " + (-b / a));
        }
        if (a == 0) {
            if (b == 0) System.out.println("Vô số nghiệm!");
            if (b != 0) System.out.println("Vô nghiệm!");
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Phương trình bậc nhất có dạng: ax+b=0");
            System.out.print("Nhập a = ");
            this.a = sc.nextFloat();
            System.out.print("Nhập b = ");
            this.b = sc.nextFloat();
            resolve();
            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
