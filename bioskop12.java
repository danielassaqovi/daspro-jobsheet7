
import java.util.Scanner;

public class bioskop12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String namaPelanggan;
      int Htiket = 50000, jmlTiket = 0;
      Double diskon, total;

      do { 
          System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
          namaPelanggan = sc.nextLine();
          if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan");
            break;
          }
          System.out.print("Masukkan jumlah tiket\t: ");
          jmlTiket = sc.nextInt();
          if (jmlTiket > 4 ) {
              diskon = 0.1;   
              }else if (jmlTiket > 10) {
                  diskon = 0.15;
          } else {
              diskon = 0.0;
          }
          total = jmlTiket * Htiket - (jmlTiket * Htiket * diskon);
          System.out.println("Total harga yang harus dibayar\t: " + total);
          sc.nextLine();
      } while (true);

      System.out.println("Semua transaksi selesai.");

  }
}