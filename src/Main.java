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
            int monthAmount = 15_000;
            int amountPurpose = 2_459_000;
            int total = 0;
            int month = 1;
            double montlyProcent = 0.01;

            while (total <=amountPurpose){
                total += monthAmount + total * montlyProcent;
                System.out.println("Месяц " + month + " , сумма накоплений равна " +month+ +total );
                month ++ ;

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
        int year = 1;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year = year + 1;
            population = population + (population / 1000 * size1000);
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
            int salary = 15000;
            int total = 0;
            int month = 0;
            int k = 12_000_000;
            int p = 7;
            for (; total < k; month++) {
                total = total + total / 100 * p;
                total = total + salary;
                if (month % 1 == 0) {
                    System.out.println("Месяц " + month + " Итого " + total);
                }
            }
            System.out.println(total);
        }


    public static void task5() {
        System.out.println("Задача 5");
            int salary = 15000;
            int total = 0;
            int k = 7;
            int month = 0;
            int p = 12_000_000;
            for (; total < p; month++) {
                total = total + total / 100 * k;
                total = total + salary;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " Итого " + total);
                }
            }
            System.out.println(total);
        }

    public static void task6() {
        System.out.println("Задача 6");
            int depositAmount = 15000;
            int total = 0;
            double montlyPeocent  = 0.07;
            int totalAmount = 12_000_000;
            int monthPurpose = 9 * 12;
            int monthCount = 1;

            while (monthCount <= monthPurpose) {
                depositAmount += depositAmount * montlyPeocent;

                if (monthCount % 6 == 0) {
                    System.out.println("Месяц " + monthCount + " сумма накоплений " + monthCount + depositAmount);
                }
                monthCount ++;
            }
        System.out.println();
    }


    public static void task7() {
        System.out.println("Задача 7");
            System.out.println();
            for (int k = 1; k <= 31; k++) {
                if (k % 7 == 0) {
                    System.out.println("Сегодня пятница, " + k + " -е число. Необходимо подготовить отчет");
                }
            }
        }
    public static void task8(){
        System.out.println("Задача 8");
        int l = 200;
        int p = 100;
        for (int year = 2022 - l; year <= 2022 + p; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
    }
            }
}}