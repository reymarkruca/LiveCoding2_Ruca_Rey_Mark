/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruca_problem1;

import java.util.Scanner;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Ruca_Problem2 {
    

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Invalid input");
        } else if (a == 0 && b == 0) {
            System.out.println("Undefined");
        } else {
            System.out.println(gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}