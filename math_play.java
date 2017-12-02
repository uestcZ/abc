package test;

import java.util.Scanner;

public class math_play { //冰雹猜想，数学实验
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int k = sr.nextInt();
        while(k!=1){
            if(k%2 != 0){
                k=3*k +1;
                System.out.print(k+"->");
            }
            else if(k%2 == 0){
                k=k/2;
                System.out.print(k+"->");
            }
        }
    }
}
