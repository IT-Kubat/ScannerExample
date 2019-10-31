package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("privet nazovite vashe imya");
        String name = scanner.nextLine();
        System.out.println("privet "  + name);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int number = scanner1.nextInt();
        System.out.println("Ваш возраст:" + number);




    }
}
