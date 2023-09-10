/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BukaTutupJalan;

/**
 *
 * @author brwnnn
 */
import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            String[] platNomorMobil = new String[4];

            int i = 0;
            do {
                System.out.print("Mobil ke-" + (i + 1) + " (4 karakter): ");
                platNomorMobil[i] = scanner.nextLine();

                if (platNomorMobil[i].length() == 4) {
                    i++;
                } else {
                    System.out.println("Plat nomor harus memiliki 4 karakter.");
                }
            } while (i < 4);

            // Menggabungkan plat nomor mobil
            StringBuilder platNomorGabungan = new StringBuilder();
            for (String platNomor : platNomorMobil) {
                platNomorGabungan.append(platNomor);
            }

            // Mengonversi ke integer
            long angkaGabungan = Long.parseLong(platNomorGabungan.toString());

            // Memeriksa apakah mobil harus berhenti atau tidak
            if ((angkaGabungan - 999999) % 5 != 0) {
                System.out.println("Berhenti");
            } else {
                System.out.println("Jalan");
            }

            System.out.print("Apakah Anda ingin mengulang (yes/no)? ");
            String ulangi = scanner.nextLine();

            if (!ulangi.equalsIgnoreCase("yes")) {
                break; // Keluar dari loop utama jika pengguna tidak ingin mengulang
            }
        } while (true);
        
        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
