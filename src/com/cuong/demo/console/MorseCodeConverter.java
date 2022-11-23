package com.cuong.demo.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {
    private final Map<Character, String> morseArr = new HashMap<>();

    public MorseCodeConverter() {
        morseArr.put('a', ".-");
        morseArr.put('b', "-...");
        morseArr.put('c', "-.-.");
        morseArr.put('d', "-..");
        morseArr.put('e', ".");
        morseArr.put('f', "..-.");
        morseArr.put('g', "--.");
        morseArr.put('h', "....");
        morseArr.put('i', "..");
        morseArr.put('j', ".---");
        morseArr.put('k', "-.-");
        morseArr.put('l', ".-..");
        morseArr.put('m', "--");
        morseArr.put('n', "-.");
        morseArr.put('o', "---");
        morseArr.put('p', ".--.");
        morseArr.put('q', "--.-");
        morseArr.put('r', ".-.");
        morseArr.put('s', "...");
        morseArr.put('t', "-");
        morseArr.put('u', "..-");
        morseArr.put('v', "...-");
        morseArr.put('w', ".--");
        morseArr.put('x', "-..-");
        morseArr.put('y', "-.--");
        morseArr.put('z', "--..");
        morseArr.put('1', ".----");
        morseArr.put('2', "..---");
        morseArr.put('3', "...--");
        morseArr.put('4', "....-");
        morseArr.put('5', ".....");
        morseArr.put('6', "-....");
        morseArr.put('7', "--...");
        morseArr.put('8', "---..");
        morseArr.put('9', "----.");
        morseArr.put('0', "-----");
        morseArr.put(' ', " ");
    }

    public void encode(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(morseArr.get(c) + " ");
        }
    }

    public void decode(String text) {
        //convert text to array
        StringBuilder data = new StringBuilder();
        ArrayList<String> dataArr = new ArrayList<>();
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                data.append(c);
            } else {
                dataArr.add(data.toString());
                data = new StringBuilder();
            }
        }
        dataArr.add(data.toString());
        //morse decode
        dataArr.forEach((code) -> {
            morseArr.forEach((key, value) -> {
                if (code.equals(value)) {
                    System.out.print(key);
                }
            });
        });
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        do {
            System.out.println("Chức năng");
            System.out.println("\t1. Morse encode");
            System.out.println("\t2. Morse decode");
            System.out.print("Lựa chọn: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1 -> {
                    System.out.print("Nhập text: ");
                    sc = new Scanner(System.in);
                    String text1 = sc.nextLine();
                    encode(text1);
                }
                case 2 -> {
                    System.out.print("Nhập text: ");
                    sc = new Scanner(System.in);
                    String text2 = sc.nextLine();
                    decode(text2);
                }
            }
            System.out.println("\nBạn có muốn tiếp tục? (y/n): ");
        } while (!sc.next().toLowerCase().equals("n"));
    }
}
