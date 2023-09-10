/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BigNumber;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author brwnnn
 */
public class BigNNumber {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan nomor 1: ");
            BigInteger num1 = input.nextBigInteger();
            System.out.print("Masukkan nomor 2: ");
            BigInteger num2 = input.nextBigInteger();

            BigInteger hasilJumlah = num1.add(num2);
            BigInteger hasilKali = num1.multiply(num2);

            System.out.println("Hasil Jumlah: " + hasilJumlah);
            System.out.println("Hasil Kali: " + hasilKali);

            System.out.print("Apakah Anda ingin melanjutkan (yes/no)? ");
            String jawaban = input.next();
            
            if (!jawaban.equalsIgnoreCase("yes")) {
                break; // Keluar dari loop jika jawaban bukan "yes"
            }
        } while (true);

        input.close();
    }
}
