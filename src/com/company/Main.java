package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*String cont;
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
        }*/
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

        /*List<String> list = Arrays.asList("Item1", "item2", "item3");
        for (String item : list) {
            System.out.println(item);
        }

        Set<String> set = new HashSet<String>();
        for(int i = 0; i < 3; i++) {
            set.add("item" + i + "set");
        }
        for (String item : set) {
            System.out.println(item);
        }
*/
        /*Map<String, String> map = new HashMap<String, String>() {

        };*/

        int count5 = 0;
        int unique = 0;
        int countMatch = 0;

        List<Integer> listRand = new ArrayList<>();
        List<Integer> listIndex = new ArrayList<>();
        List<Integer> nonUniqueIndex = new ArrayList<>();
        Map<Integer, List> listOfUnique = new HashMap<>();

        Random random = new Random();

        for(int i = 0; i < 20; i++) {
            listRand.add(random.nextInt(10) + 1);
        }

        int index = 0;
        int index2 = 0;
        for (Integer item : listRand) {
            System.out.print(item + "  ");
            if (item > 5) count5++;

            for (Integer itemUnique : listRand) {
                if (item.equals(itemUnique)) {
                    countMatch++;
                    nonUniqueIndex.add(index2);
                }
                index2++;
            }

            index2 = 0;
            if (countMatch < 2) unique++;
            else {
                listIndex.add(index);
                if (!listOfUnique.containsKey(item)) {
                    listOfUnique.put(item, new ArrayList(nonUniqueIndex));
                }
            }

            nonUniqueIndex.clear();
            countMatch = 0;
            index++;
        }

        System.out.println("\nBigger than 5 = " + count5);
        System.out.println("Unique = " + unique);

        for (Integer itemIndex : listIndex) {
            System.out.print("[" + itemIndex + "]   ");
        }

        System.out.println("\n" + listOfUnique.toString());
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
