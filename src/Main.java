import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        String leapYear = " год является високосным";
        String noLeapYear = " год не является високосным";
        if (year >= 1584) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + leapYear);
            } else {
                System.out.println(year + noLeapYear);
            }
        } else {
            System.out.println(year + noLeapYear);
        }
        //Канает?
        //Или надо чтобы в одном методе проверялось
        //А результат проверки передавался в другой метод, который печатает?
    }

    public static void task1() {
        int year = 3748;
        checkYear(year);
    }

    public static void checkClientDevice(int year, int OS) {
        if (OS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Нет информации об устройстве");
        }
    }

    public static void task2() {
        int currentYear = 2013; //LocalDate.now().getYear();
        int clientTypeOS = 0;
        checkClientDevice(currentYear, clientTypeOS);
    }

    public static void chekDistance(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task3() {
        int deliveryDistance = 57;
        chekDistance(deliveryDistance);
    }
}