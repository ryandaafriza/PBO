/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input_Output;
import java.util.Scanner;

/**
 *
 * @author brwnnn
 */
public class Input_Output {
  
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Program Pemecah Kalimat =====");
        System.out.print("Masukkan sebuah kalimat: ");
        String input = scanner.nextLine();
        scanner.close();

        // Memecah kalimat menjadi kata-kata berdasarkan spasi atau tanda kutip tunggal (')
        String[] words = input.split("\\s+|'+");

        // Menampilkan jumlah kata dalam kalimat
        System.out.println("\nJumlah kata dalam kalimat: " + words.length);

        // Menampilkan setiap kata dalam kalimat
        System.out.println("Kata-kata dalam kalimat:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}



