package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String cont;
        String object;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter type of entity = ");
            object = in.next();

            try {
                switch (object) {
                    case "bird":
                        System.out.println(new Birds().canFly());
                        break;
                    case "air":
                        System.out.println(new Aircraft().canFly());
                        break;
                    case "straus":
                        System.out.println(new Straus().canFly());
                        break;
                    default:
                        throw new IllegalArgumentException("invalid type");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Continue? y/n = ");
            cont = in.next();

            if (!cont.equals("y")) {
                break;
            }
        }
        /*UserInfo userInfo = new UserInfo();
        String cont;
        while (true) {
            userInfo.getInfo();
            userInfo.printInfo();

            Scanner in = new Scanner(System.in);
            System.out.println("Continue? y/n = ");
            cont = in.next();

            if (!cont.equals("y")) {
                break;
            }
        }*/

    }

    public static void firstMethod() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean result;
        String cont;
        while (!exit) {
            System.out.println("Enter a = ");
            a = in.nextInt();
            System.out.println("Enter b = ");
            b = in.nextInt();

            result = false;
            if ((a + b) > 50) {
                result = true;
            }
            System.out.println("r1 = " + result);

            result = false;
            if ((a * b) > 500) {
                result = true;
            }
            System.out.println("r2 = " + result);

            System.out.println("Continue? y/n = ");
            cont = in.next();

            if (!cont.equals("y")) {
                exit = true;
            }
        }
    }
}
