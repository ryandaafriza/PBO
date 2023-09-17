/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang_dan_Inventori;

/**
 *
 * @author brwnnn
 */
public class Inventori {
    private Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        for (Barang barang : barangs) {
            System.out.println(barang.getNamaBarang() + "(" + barang.getStok() + ")");
        }
    }

    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        barangs[0].tambahStok(-30); // unntuk menampilkan pesan kesalahan
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
