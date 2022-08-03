
package com.company;

import java.util.Scanner;



public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {


//        System.out.println("enter cols:");
//
//        int cols= sc.nextInt();
//        System.out.println("enter rows:");
//        int rows=  sc.nextInt();
//
//
//        for(int i=1;i<=rows;i++){
//
//            for (int j=1;j<=cols;j++){
//
//
//                if(i>=2&&i<=rows-1){
//                    if(j>1&& j<=cols-1){
//                        System.out.print("-");
//                        continue;
//                    }
//
//
//                }
//                System.out.print("x");
//
//
//            }
//            System.out.println();
//
//        }

        halfPyramid();
    }

    static void halfPyramid() {
        Scanner sc2=new Scanner(System.in);
     /*
   System.out.println("enter cols:");
int cols= sc.nextInt();
*/
        System.out.println("enter rows:");
int rows= sc.nextInt();

//
        for (int i = 1; i <=rows ; i++) {

            for (int j = 1; j <=i ; j++) {


                System.out.print("x\\");

            }
            System.out.println();
        }


    }
}