public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
        getYear(2021);
    }
    public static int getYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — не високосный год");
        }
        return year;
    }

    public static void task2() {
        System.out.println("Задание 2");
        calculateOSAndYear(1, 2018);
    }
    public static int calculateOSAndYear (int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        return clientOS;
    }

    public static void task3() {
        System.out.println("Задание 3");
        getTotal(95 );
    }

    public static int getTotal (int deliveryDistance) {
        int deliveryDay = 1;
        if (0 < deliveryDistance && deliveryDistance < 20) {
        }
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100){
        System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        return deliveryDay;
    }
}