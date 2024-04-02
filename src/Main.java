public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //  Задача 1
    public static boolean checkYear(int year) {
        return (year >= 1584) && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void printResultCheckYear(boolean checkYear, int year) {
        if (checkYear) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task1() {
        int year = 1700;
        boolean leapYear = checkYear(year);
        printResultCheckYear(leapYear, year);
    }

    //  Задача 2
    public static void checkClientDevice(int year, int typeOS) {
        System.out.print("Установите ");
        if (year < 2015) {
            System.out.print("облегченную ");
        }
        System.out.print("версию приложения для ");
        if (typeOS == 0) {
            System.out.println("iOS");
        } else System.out.println("Android");

    }

    public static void task2() {
        int year = 2013;
        int clientTypeOS = 1;
        checkClientDevice(year, clientTypeOS);
    }

    //  Задача 3
    public static int checkDistance(int deliveryDistance) {
        int days;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = 0;
        }
        return days;
    }

    public static void printDeliveryTime(int days) {
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else System.out.println("Доставки нет");
    }

    public static void task3() {
        int deliveryDistance = 70;
        int deliveryTime = checkDistance(deliveryDistance);
        printDeliveryTime(deliveryTime);
    }
}