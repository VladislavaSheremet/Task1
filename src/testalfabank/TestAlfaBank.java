package testalfabank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestAlfaBank {
    
    static int bsearch(Integer mas[], int X)
    {
        int i;
        for(i=0; i< mas.length; i++)
        {
            if(X > mas[i]) break;
        }
        if(i == mas.length) return -1;
        return i;
    }
    
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t*** Добро пожаловать ***\n");
        int k, X;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите размерность одномерного массива: ");
        k = scn.nextInt();
        Integer[] mas= new Integer[k];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random()*100); 
        }
        System.out.print("Массив: ");
        Arrays.sort(mas, Collections.reverseOrder());
        for (Integer ma : mas) {
            System.out.print(ma + " ");
        }
        System.out.print("\n");
        System.out.print("Введите X: ");
        X = scn.nextInt();
        System.out.print("Индекс первого элемента массива, строго меньшего X (начиная с нулевого): " + TestAlfaBank.bsearch(mas, X) + "\n");
    }
    
}

