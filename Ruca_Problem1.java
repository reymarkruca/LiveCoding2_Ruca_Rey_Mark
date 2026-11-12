/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruca_problem1;

import java.util.Scanner;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Ruca_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = sumOfDigits(number);
        System.out.println(+result);
    }

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }
}
