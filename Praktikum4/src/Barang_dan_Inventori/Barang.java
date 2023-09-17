/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang_dan_Inventori;

/**
 *
 * @author brwnnn
 */


public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public String getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(String kode) {
        kode_barang = kode;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama) {
        nama_barang = nama;
    }

    public int getStok() {
        return stok;
    }

    // Menambah stok barang
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok barang " + nama_barang + " sekarang adalah " + stok);
        } else {
            System.out.println("Jumlah pengadaan harus lebih dari 0.");
        }
    }
}



