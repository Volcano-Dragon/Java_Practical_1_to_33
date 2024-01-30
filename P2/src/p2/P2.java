/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;
import java.util.Scanner;
public class P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Addition: "+(a+b)+"\nSubtration: "+(a-b)+"\nDivision: "+(a/b)+"\nMultiplication: "+(a*b));
    }
    
}
