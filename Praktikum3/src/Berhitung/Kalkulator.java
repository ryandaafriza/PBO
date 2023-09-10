/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Berhitung;

import java.util.Scanner;

/**
 *
 * @author brwnnn
 */



public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban;
        
        do {
            System.out.print("Masukkan operasi matematika (contoh: 5 + 3): ");
            String text = input.nextLine();
            
            String[] fullInput = text.split(" ");
            
            if (fullInput.length != 3) {
                System.out.println("Format input tidak valid.");
            } else {
                int num1 = Integer.parseInt(fullInput[0]);
                int num2 = Integer.parseInt(fullInput[2]);
                int hasil = 0; 
                
                if (num1 >= 1 && num2 < 1000) {
                    switch (fullInput[1]) {
                        case "*":
                            hasil = num1 * num2;
                            break;
                        case "/":
                            hasil = num1 / num2;
                            break;
                        case "+":
                            hasil = num1 + num2;
                            break;
                        case "-":
                            hasil = num1 - num2;
                            break;
                        case "%":
                            hasil = num1 % num2;
                            break;
                        default:
                            System.out.println("Operator salah");
                            break;
                    }
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Invalid input");
                }
            }
            
            System.out.print("Lakukan operasi kalkulator lagi? (yes/no): ");
            jawaban = input.nextLine();
        } while (jawaban.equalsIgnoreCase("yes"));
        
        input.close();
    }
}
