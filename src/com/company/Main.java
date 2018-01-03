package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        letterGrade lg = new letterGrade();
        while(true){
            System.out.print("Enter score: ");

            Scanner sc = new Scanner(System.in);

            System.out.println(letterGrade.letterGrade(sc.nextInt()));
        }

    }
}
