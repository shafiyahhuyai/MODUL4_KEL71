package rental.mobil;

import java.util.Scanner;
/**
 *
 * @author Kelompok 71
 */
public class RentalMobil {

    public static void main(String[] args) {
      System.out.println("Selamat Datang di Program Rental Mobil");
      System.out.println("Praktikum DKP, Kelompok 71, Shift 2");
      System.out.println("Muhammad Ilham - Shafiyah Huyai");
      System.out.println("21120119130089 - 21120119120004");
      login();
    }
    public static void login(){
        Scanner input = new Scanner(System.in);
        int id;
        do
        {
            System.out.println("===============================================");
            System.out.print("Silahkan masukan username Anda : ");
            id = input.nextInt();
            if (id != 0001)
            {
                System.out.println("User id Anda tidak terdaftar");
            }
        }while (id != 0001);
        home();
    }
    public static void home(){
      System.out.println("===============================================");
      System.out.println("Anda hanya dapat menyewa mobil maksimal 2 kali");
      Scanner input = new Scanner(System.in);
      Rental1.pilihan(); 
      System.out.println("===============================================");
      System.out.print("Sewa lagi? Ya=1 : ");
      int hari=input.nextInt();
        if(hari==1){
            Rental1.pilihan();       
        }
        System.out.println("===============================================");
        System.out.println("Terimakasih. Semoga Harimu Menyenangkan :)");
        System.out.println("Jangan lupa balikin mobilnya ya:)");
    }
}
