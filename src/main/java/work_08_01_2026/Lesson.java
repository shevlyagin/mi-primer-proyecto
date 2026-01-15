package work_08_01_2026;

import java.util.Scanner;

public class Lesson {
    static void main() {

        /*
        1) for
            - используем когда знаем сколько раз нужно повторять
            - ключевые слова "от 1 до 10", "первые 5 чисел", "10 раз"
        2) while
            - используется повторяем пока условие истина
            - "до тех пор пока", "пока не введут 0"
        3) do-while
            - как while, но минимум 1 раз
            - "повторять процесс", "запрашивать пока"
         */

//          pattern1();
//          task3ByPattern1();
//          task19ByPattern4();
//          pattern2();
//          task6ByPattern2();
//          task7ByPattern2();
//          task18ByPattern4();
//          pattern3();
//          task11ByPattern3();
//          task12ByPattern3();
    }

// ==================================== ПАТТЕРНЫ ============================

    private static void pattern1() {
        /*

        Паттерн 1: Вывести числа от А до Б
        Задачи: 3,13, 14, 37, 42

        Самый простой цикл
        Шаблон:
        for(int i = начало; i < конец; i++){
            System.out.println(i);
        }

         */
        // Шаблон с шагом
        for(int i = 100; i>=0; i-=7){
            System.out.println(i);
        }
        for(int i = 0; i<=100; i+=5){
            System.out.println(i);
        }

        // преобразование FOR в WHILE
        for(int i = 5; i<=15; i++){
            System.out.println(i);
        }

        int i = 5;
        while (i<=15){
            System.out.println(i);
            i++;
        }
    }
    private static void pattern2() {
    /*

    Паттерн 2: Читать число до условия
    Задачи: 6, 7,8,9,11,12

    Ключивые слова: пока не введут 0, до отрицательного числа, повторять пока

     */

        // Шаблон while с условием выхода
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number!=0){ // Условия продолжения
            System.out.println("вы ввели: " + number);

            number = scanner.nextInt(); // Следующее число в КОНЦЕ цикла
        }

        // Шаблон do-while (минимум 1 раз)

        Scanner scanner2 = new Scanner(System.in);
        int number2;

        do {
            number2 = scanner2.nextInt();
            System.out.println("вы ввели: " + number);

        }while (number2!=0);
    }
    private static void pattern3() {
    /*

    Паттерн 3: Подсчитать сумму\среднее\количество
    Задачи: 11,12,14,18,19,20,24,25,50,51

    Ключивые слова: сумма, среднее, сколько, количество

     */

        // Универсальный шаблон
        Scanner scanner = new Scanner(System.in);
        int n = 10; // ПРОСТО ПРИМЕР!!!

        int count = 0; // счетчик
        int sum = 0; // Сумма
        int max = Integer.MIN_VALUE; // максимум
        int min = Integer.MAX_VALUE; // минимум

        for(int i = 0; i < n; i++){
            int number = scanner.nextInt();

            sum+= number; // накапливаем сумму
            count++; // считаем кол-ва

            if(number > max){
                max = number; // Ищем максимальное
            }

            if(number < min){
                min = number; // Ищем минимальное
            }
        }

        double average = (double) sum / count; // среднее
     }
    private static void pattern4() {
        /*
        Паттерн 4: подсчитать с условием
        Задачи: 5, 19, 20, 24,  26 ,27,28
        Ключевые слова: сколько из них больше Х, количество четный, есть ли кратные

        Шаблон:
         */
         Scanner scanner = new Scanner(System.in);
         int countPositive = 0;
         int countNegative = 0;
         int countZero= 0;

            for(int i=0;i<10; i++){
                int number = scanner.nextInt();
                if(number>0){
                    countPositive++;
                }else if(number<0){
                    countNegative++;
                }else{
                    countZero++;
                }
            }

            // Шаблон: еслть ли хотябы один
            boolean hasNegative = false;
            for(int i = 0; i<10; i++){
                int number = scanner.nextInt();
                if(number<0){
                    hasNegative = true;
                }
            }
            if(hasNegative){
                System.out.println("Бsли отрицательные числа");
            }
     }

// ==================================== ЗАДАЧИ ============================

    private static void task3ByPattern1() {
        for(int i = 200; i <= 300; i++) {
            System.out.println(i);
        }
    }

    private static void task7ByPattern2() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number != 0) {
            if(number > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
            number = sc.nextInt();
        }
    }
    private static void task6ByPattern2() {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while(numero >= 0) {
            System.out.println(numero * numero);

            numero = sc.nextInt();
        }

    }

    private static void task11ByPattern3() {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;

        while(number != 0) {
            sum+= number;
            number = sc.nextInt();
        }
        System.out.println("Сумма " + sum);
    }
    private static void task12ByPattern3() {

        // Решение 12 задачи (среднее до отрицательно)
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number = scanner.nextInt();

        while (number>=0){
            sum+=number;
            count++;

            number=scanner.nextInt();
        }

        double average = 0;
        if(count >0){
            average = (double) sum / count;
        }
        System.out.println("Среднее: " + average);

    }

    private static void task5ByPattern3_4() {

        for(int i = 1; i <= 100; i++){
            if(i % 5 != 0){
                System.out.println(i);
            }
        }

    }
    private static void task19ByPattern4() {
        Scanner sc = new Scanner(System.in);
        double sumSalary = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            double salary = sc.nextDouble();
            sumSalary = sumSalary + salary;
            if (salary > 1000){
                count++;
            }
        }
        System.out.println("Сумма: " + sumSalary + " "
                + "Кол-во зарплат выше 1000 евро: " + count);
    }
    private static void task18ByPattern4() {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        int sumPositive = 0;
        int sumNegative = 0;

        for(int i=0; i<10; i++){
            int number = sc.nextInt();
            if(number>0) {
                countPositive++;
                sumPositive = sumPositive + number;
            } else if (number<0){
                countNegative++;
                sumNegative = sumNegative + number;
            } else {
                countZero++;
            }
        }
        System.out.println("Среднее арифметическое положительных чисел: " + sumPositive/countPositive);
        System.out.println("Среднее арифметическое отрицательных чисел: " + sumNegative/countNegative);
        System.out.println("Кол-во нулей: " + countZero);
    }
}

