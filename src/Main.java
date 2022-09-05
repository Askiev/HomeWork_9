public class Main {
    public static void main(String[] args) {
        printIsleap(2020);
        osVersion(1, 2020);
        printCalculateDeliveryDays(95);
    }

    //task1


    public static void printIsleap(int year) {
        if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    //task2


    public static void osVersion(int os, int productionYear) {
        int newYear = 2022;
        int androidOS = 1;
        int AOS = 0;
        if (os == androidOS) {
            System.out.print("для Android по ссылке ");
        } else if (os == AOS) {
            System.out.print("для iOS по ссылке ");
        } else {
            System.out.println("что за телефон? ");
            return;
        }
        if (productionYear < newYear) {
            System.out.print("установите облегченную версию приложения");
        } else {
            System.out.print("установите версию приложения");
        }
        System.out.println();
    }

    //task3


    public static int printCalculateDeliveryDays(int distance) {
        int start = 20;
        int step = 40;
        int result = 1; //кол во дней
        if (distance >= start) {
            result = (Math.abs((distance - start) / step) + 2);
        }
        System.out.println("Потребуется для доставки дней: " + result);

        return start;
    }

}