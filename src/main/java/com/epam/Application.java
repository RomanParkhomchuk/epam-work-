package com.epam;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

}
//for (int i=1;i<=3;i++){
//System.out.println("");
//for (int o=1;o<=5;o++)
//   System.out.print("* ");
// }
// System.out.println("darova vsem");
// System.out.println("давай вводь число, а я його суммую з усіма числами до нього:");
// Scanner input = new Scanner(System.in);
// int value= input.nextInt();
// int sum = 0;
// for (int i=1;i<=value;i++){
//     sum = sum + i;}
// System.out.println("Мій магічний шар показує: " + sum); //copyright дєлай
//}
//public static void main(String[] args) {
// System.out.println("enter a number");
//for (int i = 3; i <= 10; i++) {

// Scanner input = new Scanner(System.in);
// int value = input.nextInt();
// System.out.println(value); }

//}



