
import java.util.Scanner;

public class kafeDoWhile12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //deklarasi variabel 
      int kopi, teh, roti;
      String namaPelanggan;
      int totalHarga, Hkopi = 12000, Hteh = 7000, Hroti = 20000;

      do { 
          System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
          namaPelanggan = sc.nextLine();
          if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan");
            break;
          }
          System.out.print("Jumlah kopi\t: ");
          kopi = sc.nextInt();
          System.out.print("Jumlah teh\t: ");
          teh = sc.nextInt();
          System.out.print("Jumlah roti\t: ");
          roti = sc.nextInt();

          //logic
          totalHarga = (kopi * Hkopi) + (teh * Hteh) + (roti * Hroti);
          System.out.println("Total yang harus dibayar: " + totalHarga);
          sc.nextLine();
          
      } while (true);

      System.out.println("Semua transaksi selesai.");

  }

}