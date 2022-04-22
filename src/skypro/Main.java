package skypro;

import java.time.LocalDate;

public class Main {
    //    public static void printSeparator() {
//        System.out.println("+++++++++++++++++++++++++++++");
//        System.out.println("-----------------------------");
//    }
//
//    public static void printIssues(int issueCount) {
//        System.out.println(issueCount);
//    }
//
//    public static int sum(int[] numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        return sum;
//    }
    public static void proverkaGoda(int god) {
        int year = god;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("god visokosniy");
        } else if (year % 400 == 0) {
            System.out.println("god visokosniy");
        } else {
            System.out.println("god ne visokosniy");
        }
    }

    public static void anroidIphone(int a, int b) {
        int clientOS = a;
        int clientDeviceYear = b;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("ustanovite prilojenie android po ssilke");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("ustanovita obleg4ennuyu versiu ANDROID po ssilke");
        }
        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("ustanovite prilojenie iOS po ssilke");
        }
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("ustanovita obleg4ennuyu versiu iOS po ssilke");
        }
    }

    public static void dostavkaSrok(int rasstoyanie) {
        int deliveryDistance = rasstoyanie;

        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("dostavka zaymet " + deliveryDay + " den");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("dostavka zaymet " + (deliveryDay + 1 + " dnia"));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("dostavka zaymet " + (deliveryDay + 2 + " dnia"));
        } else {
            System.out.println("dostavki net");
        }
    }

    public static void main(String[] args) {
//        int[] issuesMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
//        printSeparator();
//        for (int i = 0; i < issuesMonth.length; i++) {
//            printIssues(issuesMonth[i]);
//
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//
//        }
//        printSeparator();
//        int total = sum(issuesMonth);
//        printIssues(total);

        //       задача1

        int god = 2020;
        proverkaGoda(god);

        //       задача2

        int a = 0;
        int b = 2022;
        anroidIphone(a, b);

        //       задача3

        int rasstoyanie = 35;
        dostavkaSrok(rasstoyanie);

        //       задача4


    }
}
