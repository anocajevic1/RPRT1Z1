package com.company;
import  java.util.Scanner;

public class Main {

    private static int SumaCifara (int broj) {
        int suma = 0;
        while(broj!=0) {
            suma += broj%10;
            broj /= 10;
        }

        return suma;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Unesite broj n : ");
            int n = scan.nextInt();

            for(int i=1; i<=n; i++){
                    if(i%SumaCifara(i)== 0)
                            System.out.println(i);
            }

            }
}
