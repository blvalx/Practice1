import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Практическая работа №1");
//////////////////////// Задание №3////////////////////////////
        System.out.println("\nЗадание №3");
        int[] array = {1,2,3,4,5,6,7,8,9,15};

        System.out.println("Массив: ");
        for(int a: array) {
            System.out.print(a + " ");
        }

        int sum = 0;
        for(int a: array){
            sum += a;
        }
        System.out.println("\n(for)Сумма массива = " + sum);

        sum = 0;
        int i = array.length - 1;
        while (i >= 0){
            sum += array[i];
            i--;
        }
        System.out.println("(while)Сумма массива = " + sum);

        sum = 0;
        i = array.length - 1;
        do {
            sum += array[i];
            i--;
        } while(i >= 0);
        System.out.println("(do while)Сумма массива = " + sum);

//////////////////////// Задание №4////////////////////////////
        System.out.println("\nЗадание №4");
        for(String str : args){
            System.out.print(str);
        }
//////////////////////// Задание №5////////////////////////////
        System.out.println("\nЗадание №5");

        for(int j = 1; j < 11; j++){
            System.out.format("%.3f%n",(1.0/j));
        }
//////////////////////// Задание №6////////////////////////////
        System.out.println("\nЗадание №6");

        System.out.println("(Math.random)Массив: ");
        int[] mass = new int[10];
        for(int j = 0; j < 10; j++ ) {
            mass[j] = (int) (Math.random() * 100);
            System.out.print(mass[j] + " ");
        }

        int temp;
        for(int j = 0; j < 10; j++ ) {
            for(int k = 0; k < 10; k++) {
                if (mass[j] < mass[k]){
                    temp = mass[j];
                    mass[j] = mass[k];
                    mass[k] = temp;
                }
            }
        }
        System.out.println("\n(Math.random)Отсортированный массив: ");
        for(int j = 0; j < 10; j++ ) {
            System.out.print(mass[j] + " ");
        }

        Random random = new Random();
        System.out.println("\n(Random)Массив: ");
        for(int j = 0; j < 10; j++ ) {
            mass[j] = random.nextInt(100);
            System.out.print(mass[j] + " ");
        }

        for(int j = 0; j < 10; j++ ) {
            for(int k = 0; k < 10; k++) {
                if (mass[j] < mass[k]){
                    temp = mass[j];
                    mass[j] = mass[k];
                    mass[k] = temp;
                }
            }
        }
        System.out.println("\n(Random)Отсортированный массив: ");
        for(int j = 0; j < 10; j++ ) {
            System.out.print(mass[j] + " ");
        }
//////////////////////// Задание №7////////////////////////////
        System.out.println("\n\nЗадание №7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");


        try {
            factorial(scanner.nextInt());
        } catch (InputMismatchException a) {
            System.out.println("Введено некорректное число");
        }
    }

    public static void factorial(int a) {
        if(a >= 0) {
            int result = 1;
            for(int i = 1; i <= a; i++) {
                result *= i;
            }
            System.out.println("Факториал " + a + " = " + result);
        }
        else
            System.out.println("Введено некорректное число");
    }
}