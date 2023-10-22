package Kasus3;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow many string do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        stringList = new String[size];

        System.out.println("\nEnter the string...");
        for(int i=0; i<size; i++){
            stringList[i] = scan.nextLine();
        }
        Sorting.insertionSort(stringList);
        System.out.println("\nYour numbers in sorted order...");
        for(int i=0; i<size; i++){
            System.out.println(stringList[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
