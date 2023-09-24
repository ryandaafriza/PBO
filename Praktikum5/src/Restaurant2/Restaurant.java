package Restaurant2;

public class Restaurant {
    private String[] nama_makanan;
    private double [] harga_makanan;
    private int [] stok;
    private static byte id = 0;


    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double [10];
        stok = new int [10];
    } 

    public void tambahMenuMakanan (String nama, double harga, int stok ) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        this.nextId();
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if(!isOutOfStock(i)) {
                System.out.println(i+1+ " " +nama_makanan[i] + "["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if(stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void nextId() {
        id++;
    }
    // modul untuk pemesanan makanan oleh konsumen
    public void Pesan(Byte no, int jumlah) {
        if(cekStok(no,jumlah)){
            decreaseStok(no,jumlah);
            System.out.println("\nmakanan yang dipesan adalah "+nama_makanan[no-1]+" sebanyak "+jumlah+" buah");
            System.out.println("total harga yang harus dibayar adalah Rp."+harga_makanan[no-1]*jumlah);
            System.out.println("makanan yang tersisa adalah");
            tampilMenuMakanan();
        }   else {
            System.out.print("stok barang kurang\n");
        }
    }
    // modul untuk mengecek apakah stok makan masih tersedia atau tidak
    public boolean cekStok(Byte no, int jumlah){
        if(stok[no-1]-jumlah < 0) return false;
        else return true;
    }
    // modul untuk mengurangi jumlah stok makanan
    public void decreaseStok(byte no, int jumlah){
        stok[no-1] -= jumlah;
    }
    // modul untuk mengecek perulangan pembelian makanan
    public boolean cekconfirm(char confirm){
        if (confirm == 'y') return true;
        else return false;
    }
}