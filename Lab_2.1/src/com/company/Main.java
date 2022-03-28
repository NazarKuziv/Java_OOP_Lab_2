package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System. in);

    static void Create(int[] b)
    {
        Random x = new Random();

        for (int i = 0; i < b.length; i++)
            b[i] = x.nextInt(-40,50);
    }
    static void Print(int[] b)
    {
        System.out.print("Arr b = {");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println("}");
    }
    static int SearchMin(int[] b)
    {
        int min = 0;
        int imin = -1;
        for (int i = 0; i < b.length; i++)
            if (b[i] % 2 == 0)
            {
                min = b[i];
                imin = i;
                break;
            }




        if (imin == -1)
            return -1;
        else
        {
            for (int i = imin + 1; i < b.length; i++)
                if (b[i] < min && b[i] % 2 == 0)
                {
                    min = b[i];
                    imin = i;
                }

            return imin;
        }

    }
    static void Castling(int[] b)
    {
        int first = b[0];
        int imin = SearchMin(b);
        if(imin != -1)
        {
            b[0] = b[imin];
            b[imin] = first;
            Print(b);
        }
        else
            System.out.println("There are no paired elements");

    }


    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] b =new int[n];
        Create(b);
        Print(b);
        Castling(b);


    }
}
