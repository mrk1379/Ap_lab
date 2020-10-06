package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1,number2,check=0;

        Scanner myscanner = new Scanner(System.in);
        System.out.println("2 adad vared konid");
        number1 = myscanner.nextInt();
        number2 = myscanner.nextInt();

        for (int counter = 2;counter<=number1;counter++){
            if (number1%counter==0 && number2%counter==0){
                check=1;
            }
        }
        if(check==0){
            System.out.println("aval");
        }else {
            System.out.println("GHair aval");
        }

    }
}
