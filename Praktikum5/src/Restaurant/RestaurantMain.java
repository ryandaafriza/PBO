/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import java.util.logging.*;

public class RestaurantMain {
    private static final Logger logger = Logger.getLogger(RestaurantMain.class.getName());

    public static void main(String[] args) {
        byte nomor = 3;
        int jumlah = 10;
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_500, 20);
        menu.tambahMenuMakanan("Martabak", 2_000, 10);
        menu.tambahMenuMakanan("Molen", 2_000, 20);
        menu.tambahMenuMakanan("karoket", 2_000, 15);
        menu.tambahMenuMakanan("pisang", 1_500, 20);
        menu.tambahMenuMakanan("cireng", 500, 20);
        menu.tambahMenuMakanan("donat", 2_500, 15);
        menu.tambahMenuMakanan("cimol", 5_000, 10);
        menu.tambahMenuMakanan("basreng", 5_000, 10);

        logger.log(Level.INFO, "Daftar Makanan yang tersedia");
        menu.tampilMenuMakanan();

        menu.pesan(nomor, jumlah);

        logger.log(Level.INFO, "Terima kasih telah membeli produk kami");
    }
}
