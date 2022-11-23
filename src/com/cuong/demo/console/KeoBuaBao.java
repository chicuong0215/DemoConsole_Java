package com.cuong.demo.console;

import java.util.Random;
import java.util.Scanner;

public class KeoBuaBao {
    private final String[] arr = new String[]{"keo", "bua", "bao"};

    public KeoBuaBao() {

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        do {
            System.out.println("Lựa chọn của bạn (keo, bua, bao): ");
            String userSelection = sc.next();
            String machineSelection = arr[random.nextInt(3)];

            System.out.println("Bạn chọn: " + userSelection);
            System.out.println("Máy chọn: " + machineSelection);

            switch (userSelection) {
                case "keo":
                    switch (machineSelection) {
                        case "keo" -> System.out.println("Hòa nhau!");
                        case "bua" -> System.out.println("Bạn thua!");
                        case "bao" -> System.out.println("Bạn thắng!");
                    }
                    break;
                case "bua":
                    switch (machineSelection) {
                        case "bua" -> System.out.println("Hòa nhau!");
                        case "bao" -> System.out.println("Bạn thua!");
                        case "keo" -> System.out.println("Bạn thắng!");
                    }
                    break;
                case "bao":
                    switch (machineSelection) {
                        case "bao" -> System.out.println("Hòa nhau!");
                        case "keo" -> System.out.println("Bạn thua!");
                        case "bua" -> System.out.println("Bạn thắng!");
                    }
                    break;
            }

            System.out.println("Bạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
