/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GajiAgent;

import java.util.Scanner;

/**
 *
 * @author brwnnn
 */
public class GajiAgent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Mengambil input jumlah penjualan bulan ini
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = input.nextInt();
        
        // Gaji pokok
        double gajiPokok = 500000.00;
        
        // Harga setiap item
        double hargaItem = 50000.00;
        
        // Inisialisasi bonus penjualan
        double bonusPenjualan = 0.0;
        
        // Menghitung bonus penjualan
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            bonusPenjualan = (jumlahPenjualan - 15) * 0.10 * hargaItem;
        } else if (jumlahPenjualan > 80) {
            bonusPenjualan = jumlahPenjualan * 0.35 * hargaItem;
        }
        
        // Menghitung denda jika penjualan kurang dari 15 item
        if (jumlahPenjualan < 15) {
            double denda = (15 - jumlahPenjualan) * 0.15 * hargaItem;
            gajiPokok -= denda;
        }
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + bonusPenjualan;
        
        // Menampilkan total gaji
        System.out.println((int) totalGaji); // Mengubah ke bilangan bulat
    }
}
