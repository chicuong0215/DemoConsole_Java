package com.cuong.demo.console;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BauCua {
    private final Map<String, Integer> selectArr = new HashMap<>();
    private final String[] arr = new String[]{"nai", "bau", "ga", "ca", "cua", "tom"};
    long score = 1000;

    public BauCua() {
        selectArr.put("nai", 0);
        selectArr.put("bau", 0);
        selectArr.put("ga", 0);
        selectArr.put("ca", 0);
        selectArr.put("cua", 0);
        selectArr.put("tom", 0);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        do {
            if (score > 0) {
                System.out.println("Điểm hiện tại: " + score);
                System.out.println("Lựa chọn: ");
                selectArr.forEach((k, v) -> {
                    System.out.print("\t" + k + " - điểm đặt cược: ");
                    selectArr.replace(k, sc.nextInt());
                    score -= selectArr.get(k);
                });

                String item1 = arr[random.nextInt(6)];
                String item2 = arr[random.nextInt(6)];
                String item3 = arr[random.nextInt(6)];

                System.out.println("Kết quả:");
                selectArr.forEach((k, v) -> {
                    if (k.equals(item1)) {
                        System.out.println("\t" + item1 + ": +" + 2 * selectArr.get(k));
                        score += 2L * selectArr.get(k);
                    }
                    if (k.equals(item2)) {
                        System.out.println("\t" + item2 + ": +" + 2 * selectArr.get(k));
                        score += 2L * selectArr.get(k);
                    }
                    if (k.equals(item3)) {
                        System.out.println("\t" + item3 + ": +" + 2 * selectArr.get(k));
                        score += 2L * selectArr.get(k);
                    }
                });
                System.out.println("Điểm hiện tại: " + score);
            } else {
                System.out.println("Bạn đã phá sản!");
            }
            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
