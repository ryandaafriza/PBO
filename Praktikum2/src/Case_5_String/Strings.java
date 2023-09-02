/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Case_5_String;


/**
 *
 * @author brwnnn
 */
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
          
            System.out.println("Masukkan string A:");
            String A = scanner.nextLine();
            System.out.println("Masukkan string B:");
            String B = scanner.nextLine();

          
            int totalLength = A.length() + B.length();
            System.out.println("panjang: " + totalLength);

            
            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

           
            String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println("Hasil Kapitalisasi: " + capitalizedA + " " + capitalizedB);

            System.out.println("Ingin mengulangi? (y/n)");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }
}

