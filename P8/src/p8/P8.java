/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p8;

public class P8 {

    public static void main(String[] args) {
        int a = 1; int b = 0; int n = 9;
        System.out.print("Fibo series: 0");
        while(n>0){
            System.out.print(", "+(a+b));
            b = a+b; a = b-a; n--;        
        }
    }
    
}
