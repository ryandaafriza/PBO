/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Restaurant;

import java.util.logging.*;

public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private byte id = 0;
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());

    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        this.id++;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                String message = String.format("%d %s[%d]\tRp. %.2f", (i + 1), namaMakanan[i], stok[i], hargaMakanan[i]);
                logger.log(Level.INFO, message);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public boolean cekStok(byte no, int jumlah) {
        boolean stokCukup = stok[no - 1] - jumlah >= 0;
        if (!stokCukup) {
            logger.log(Level.WARNING, "Stok barang kurang");
        }
        return stokCukup;
    }

    public void pesan(byte no, int jumlah) {
        if (cekStok(no, jumlah)) {
            decreaseStok(no, jumlah);
            String pesanMakanan = String.format("Makanan yang dipesan adalah %s sebanyak %d", namaMakanan[no - 1], jumlah);
            String totalHarga = String.format("Total harga yang harus dibayar adalah Rp. %.2f", hargaMakanan[no - 1] * jumlah);

            logger.log(Level.INFO, pesanMakanan);
            logger.log(Level.INFO, totalHarga);
            logger.log(Level.INFO, "Makanan yang tersisa adalah");
            tampilMenuMakanan();
        }
    }

    public void decreaseStok(byte no, int jumlah) {
        stok[no - 1] -= jumlah;
    }
}
