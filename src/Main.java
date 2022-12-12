public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            int contribution = 15_000;
            double total = 0;
            int month = 0;
            while (total <= 2_459_000) {
                month = month + 1;
                total = total + contribution;
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int start = 10;
        while (start > 0) {
            System.out.print(start);
            start = start - 1;
        }
        System.out.println();
        for (int k = 0; k <= 10; k++) {
            System.out.print(k);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate1000 = 17;
        int mortality1000 = 8;
        int size1000 = birthRate1000 - mortality1000;
        int i = 1;
        while (i <= 10) {
            System.out.println("Год " + i + ", численность населения составляет " + population);
            i = i + 1;
            population = population + (population / 1000 * size1000);
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        {
            int salary = 15000;
            int total = 0;
            int i = 0;
            for (; total < 12_000_000; i++) {
                total = total + total / 100 * 7;
                total = total + salary;
                if (i % 1 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
            System.out.println(total);
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        {
            int salary = 15000;
            int total = 0;
            int i = 0;
            for (; total < 12_000_000; i++) {
                total = total + total / 100 * 7;
                total = total + salary;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
            System.out.println(total);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        {
            int salary = 15000;
            int total = 0;
            int i = 0;
            for (; total < 560569; i = i + 6) {
                total = total + total / 100 * 7;
                total = total + salary;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
        }
        System.out.println();
    }


    public static void task7() {
        System.out.println("Задача 7");
        {
            System.out.println();
            for (int k = 1; k <= 31; k++) {
                if (k % 7 == 0) {
                    System.out.println("Сегодня пятница, " + k + " -е число. Необходимо подготовить отчет");
                }
            }
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        for (int k = 2022 - 200; k <= 2022 + 100; k++) {
            if (k % 79 == 0) {
                System.out.println(k);
    }
            }
}}