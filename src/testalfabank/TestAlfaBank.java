package testalfabank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestAlfaBank {
    
    private static int bsearch(Integer arr[], int value) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (value > arr[i]) break;
        }
        if (i == arr.length) return -1;
        return i;
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t*** Добро пожаловать ***\n");
        System.out.print("Введите размерность одномерного массива: ");
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        Integer[] arr = new Integer[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("Массив: ");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int ma : arr) {
            System.out.print(ma + " ");
        }
        System.out.print("\n");
        System.out.print("Введите число: ");
        int value = scn.nextInt();
        System.out.print("Индекс первого элемента массива, строго меньшего введенного значения: " + TestAlfaBank.bsearch(arr, value) + "\n");
    } 
}

