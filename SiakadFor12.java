
import java.util.Scanner;

public class SiakadFor12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double nilai, tertinggi = 0, terendah =  100;

      //struktur perulangan for
      for (int i = 1; i <= 10; i++){
          System.out.print("Masukkan nilai mahasiswa ke-" + i + "\t: ");
          nilai = sc.nextDouble();
          if (nilai > tertinggi){
            tertinggi = nilai;
          }
          if (nilai < terendah){
            terendah = nilai;
          }
      }
      
      //output
      System.out.println("Nilai tertinggi\t: " + tertinggi);
      System.out.println("Nilai terendah\t: " + terendah);

  }
}