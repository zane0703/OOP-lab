package part1;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new String[size];
        System.out.println ("\nEnter the text...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextLine();
        Sorting.selectionSort(intList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}
