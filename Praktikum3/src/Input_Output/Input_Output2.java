/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Input_Output;

import java.util.Scanner;

/**
 *
 * @author brwnnn
 */
public class Input_Output2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukan input:");
        
        while (scanner.hasNext()) {
            String s = scanner.next();
            int x = scanner.nextInt();
            
            // Format the output
            System.out.printf("%-15s%03d%n", s, x);
        }
        
        scanner.close();
    }
}


