package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secInStep = 10;
        int floor;
        int stepInStraight = 15;
        int straightInFloor = 2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("программа позволяет понять на сколько секунду увеличилась вша жизнь при подьёме на ");

        System.out.print("Введите номер этажа, на который вы хотите подняться: ");
        floor = scanner.nextInt();

        result = secInStep * stepInStraight * straightInFloor * floor;

        System.out.print("Ваша жизнь увеличилась на " + result + " секунд");
    }
}
