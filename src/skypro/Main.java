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
           if (god % 4 == 0 && god % 100 != 0) {
            System.out.println("god visokosniy");
        } else if (god % 400 == 0) {
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

    public static void reversMassiva(int[] arr) {
        int[] Reversearr = arr;
        for (int i = Reversearr.length - 1; i >= 0; i--) {
            System.out.print(Reversearr[i]);
        }
    }
        public static void zadacha4 (String s) {
            String ss = s;
            String[] sorting = s.trim().split("");
            for (int i = 0; i < sorting.length - 1; i++) {
                if (sorting[i].equals(sorting[i + 1])) {
                    System.out.print(sorting[i]);
                }
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

        int god = 1700;
        proverkaGoda(god);

        //       задача2

        int a = 0;
        int b = 2022;
        anroidIphone(a, b);

        //       задача3

        int rasstoyanie = 35;
        dostavkaSrok(rasstoyanie);

        //       задача4
        String s = "aabccddefgghiijjkk";
        zadacha4 (s);


        //       задача5
        System.out.println();
        System.out.println();
        int[] arr = {3, 2, 1, 6, 5};
        reversMassiva(arr);

    }
}
