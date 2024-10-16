import java.util.Scanner;

public class bioskop12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int hargaTiket = 50000;
        int jml_tiket, total_tiket_terjual = 0;
        float diskon = 0, total_harga = 0, harga_diskon = 0, total_penjualan = 0;
        boolean isLanjut = true;

        //judul
        System.out.println("=========================================");
        System.out.println("======= Perhitungan Tiket Bioskop =======");
        System.out.println("=========================================");

        //logic dan inputan
        while (isLanjut) {

            //input jumlah tiket yang akan dibeli
            System.out.print("Masukkan jumlah tiket : ");
            jml_tiket = input.nextInt();

            //jika input negatif
            if (jml_tiket < 0) {
                System.out.println("Jumlah tidak bisa negatif, masukkan jumlah yg benar!");
                continue;
            }

            //jika input valid
            //menghitung jumlah tiket yg terjual
            total_tiket_terjual += jml_tiket;

            //hitung total harga (bayar)
            total_harga = jml_tiket * hargaTiket;

            //hitung harga (bayar) setelah diskon
            if (jml_tiket > 10) {
                diskon = 0.15f;
                harga_diskon = total_harga - (total_harga * diskon);
            }
            else if (jml_tiket > 4) {
                diskon = 0.1f;
                harga_diskon = total_harga - (total_harga * diskon);
            }
            else {
                harga_diskon = total_harga;
            }

            //total penjualan
            total_penjualan += harga_diskon;

            //output untuk transaksi sementara
            System.out.println("Total harga untuk " + jml_tiket + " tiket adalah Rp " + harga_diskon);

            //input isLanjut
            System.out.print("Apakah lanjut? (true / false) : ");
            isLanjut = input.nextBoolean();

        };

        //output data semua transaksi
        System.out.println("=========================================");
        System.out.println("Total tiket terjual\t : " + total_tiket_terjual);
        System.out.println("Total penjualan\t\t : " + total_penjualan);

    }

}