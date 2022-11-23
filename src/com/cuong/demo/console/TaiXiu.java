package com.cuong.demo.console;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public TaiXiu() {

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        do {
            System.out.println("Lựa chọn của bạn (tai, xiu): ");
            String userSelection = sc.next().toLowerCase();
            int item1 = random.nextInt(6);
            int item2 = random.nextInt(6);
            int item3 = random.nextInt(6);
            int result = item1 + item2 + item3;

            //xỉu
            if (result >= 4 && result <= 10) {
                System.out.println("Kết quả: xỉu");
                if (userSelection.equals("xiu")) System.out.println("Bạn thắng!");
                else System.out.println("Bạn thua!");
            }
            //tài
            else if (result >= 11 && result <= 17) {
                System.out.println("Kết quả: tài");
                if (userSelection.equals("tai")) System.out.println("Bạn thắng!");
                else System.out.println("Bạn thua!");
            }
            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
