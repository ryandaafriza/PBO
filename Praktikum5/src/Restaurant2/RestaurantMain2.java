/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant2;

import java.util.Scanner;

public class RestaurantMain2 {
    public static void main(String[] args) {
        byte Nomor = 0;
        int Jumlah = 0;
        char confirm = 'y';
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala",1_000,20);
        menu.tambahMenuMakanan("Gehu",1_500, 20);
        menu.tambahMenuMakanan("Martabak",2_000,10);
        menu.tambahMenuMakanan("Molen",2_000,20);
        menu.tambahMenuMakanan("karoket",2_000 , 15);
        menu.tambahMenuMakanan("pisang", 1_500, 20);
        menu.tambahMenuMakanan("cireng", 500, 20);
        menu.tambahMenuMakanan("donat", 2_500, 15);
        menu.tambahMenuMakanan("cimol", 5_000, 10);
        menu.tambahMenuMakanan("basreng", 5_000, 10);
        System.out.println("Daftar Makanan yang tersedia");
        menu.tampilMenuMakanan();

    while (menu.cekconfirm(confirm)){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nomor makanan yang ingin dipesan : ");
        Nomor = sc.nextByte();
        System.out.print("masukan jumlah yang diinginkan : " );
        Jumlah = sc.nextInt();
        menu.Pesan(Nomor, Jumlah);
        System.out.println("tekan y jika ingin memesan lagi, tekan t jika tidak");
        confirm = sc.next().charAt(0);
        }
        System.out.println("Terima kasih telah membeli produk kami");
        
    }
}