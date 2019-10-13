package com.company;
import java.util.Scanner;

public class HomeWork {
    public static void main (String [] args) {
      /* // Task 1.1
       System.out.println( "Please, enter your name: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
        System.out.println("Hello, " + name +"!" );
}

// Task 1.2
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.println("Argument = " + args[i]);
        }

// Task 1.2
        /*String result = "";
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            result += String.valueOf(random.nextInt()) + "\n";
                 }
        System.out.print(result);*/

      // Task 1.3
      /*  Random random = new Random();
        int num = random.nextInt(100);
        for(int i = 0; i < 5; i++)
        System.out.println ("The Randomly generated integer is : " + i);

// Task 1.4
        /*System.out.println("Enter password: ");
        Scanner scan = new Scanner(System.in);
        String enteredPassword = scan.next();
        String realPass = "12345";
        if (enteredPassword.equals(realPass))
            System.out.println("Correct password");
        else System.out.println("Wrong password, please, try one more time ");*/

// Task 1.5
       /* int summ = 0;
        int comp = 1;
        for (int i = 0; i <args.length ; i++) {
            int  acs=Integer.parseInt(args[i]);
            summ=summ + acs;
            comp=comp *acs;
        }
        System.out.println("Sum = " + summ);
        System.out.println("Composition = " + comp);*/


        //Task 1.6
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int count = scan.nextInt();
        int[] arr = new int[count];
        System.out.println("Enter your numbers:");
        for(int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }
               for (int j = 0; j < count; j++)//even and odd numbers
            if (arr[j] % 2 != 0)
                System.out.println("Odd numbers:" + arr[j]);
            else if (arr[j] % 2 == 0)
                System.out.println("Even numbers:" + arr[j]);

        int max = arr[0], min = arr[0]; //min & max
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

        for (int i = 0; i < count; i++)
            if ((arr[i] % 3 == 0) || (arr[i] % 9 == 0))
        System.out.println("Number, which is divided by 3 or 9: " + arr[i]);

            else if ((arr[i] % 5 == 0) && (arr[i] % 7 == 0))
        System.out.println("Number, which is divided by 5 and 7: " + arr[i]);


    }

    }

