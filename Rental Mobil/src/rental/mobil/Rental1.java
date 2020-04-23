package rental.mobil;

import java.util.Scanner;
/**
 *
 * @author Kelompok 71
 */
public class Rental1 {
   int hari;
   int harga;
   int sewa;
   double mobil;
   Scanner input = new Scanner(System.in);
//    konstructor over loading rental untuk mobil harian
    public Rental1(int sewa){
        this.sewa=sewa;    
        System.out.println("Sewa perhari :"+sewa);
    } 
//    konstructor over loading rental untuk mobil sport
    public Rental1(int mobil,int hari){    
        this.mobil=mobil;
        this.hari=hari;
        int byr=mobil*hari;   
        System.out.println("Sewa perhari :"+byr);
    }
    public static void pilihan(){
        int pilih;
     Scanner input = new Scanner(System.in);
     System.out.println("Silahkan Pilih Jenis Mobil :");
     System.out.println("1. City Car");
     System.out.println("2. Sport Car");
     System.out.print("Masukkan pilihan : "); 
        pilih = input.nextInt();
        switch(pilih){
            case 1:
            Rental1.ctcar();
            break;
            case 2:
            Rental1.sprtcar();
            break;
            default:
            System.out.println("Pilihan yang Anda masukkan tidak valid");
            break;
     }
    }
//    methode city car
    public static void ctcar(){
            Scanner input = new Scanner(System.in);
            System.out.println("===============================================");
            System.out.println("Pilihan City Car");
            System.out.println("===============================================");
            System.out.println("1.Honda Brio RS");
            System.out.println("2.Suzuki Ignis");
            System.out.println("3.Datsun Cross");
            System.out.println("4.Daihatsu Sirion");
            System.out.print("Masukkan pilihan : ");
            int pilih1 = input.nextInt();
            switch(pilih1){
                    case 1:
                     Rental1 brio=new Rental1(80000);
                     brio.tampilctcar();
                  break;
                    case 2:
                    Rental1 ignis=new Rental1(70000);
                    ignis.tampilctcar();
                  break;
                    case 3:
                        Rental1 cross=new Rental1(100000);
                        cross.tampilctcar();
                  break;
                    case 4:
                        Rental1 sirion=new Rental1(50000);
                        sirion.tampilctcar();
                  break;
                  default:
            System.out.println("Pilihan yang anda masukkan tidak valid");
            break;
            }
    }
//    methode sport car
    public static void sprtcar(){
            Scanner input = new Scanner(System.in);
            System.out.println("===============================================");
            System.out.println("Pilihan Sport Car ");
            System.out.println("===============================================");
            System.out.println("1.Bugati Chiron");
            System.out.println("2.Pagani Huayra");
            System.out.println("3.Koenigsegg Agera");
            System.out.println("4.Lamborghini Aventador");
            System.out.println("5.McLaren P1");
            System.out.print("Masukkan pilihan : ");
            int pilih2=input.nextInt();
            switch(pilih2){
                    case 1:
                     Rental1 chiron=new Rental1(400000,1);
                     chiron.tampilsprtcar();
                    break;
                    case 2:
                    Rental1 huayra=new Rental1(300000,1);
                    huayra.tampilsprtcar();
                    break;
                    case 3:
                        Rental1 agera=new Rental1(350000,1);
                        agera.tampilsprtcar();
                    break;
                    case 4:
                        Rental1 aventador=new Rental1(400000,1);
                        aventador.tampilsprtcar();
                    break;
                    case 5:
                        Rental1 P1=new Rental1(250000,1);
                        P1.tampilsprtcar();
                    break;
                    default:
            System.out.println("Pilihan yang anda masukkan tidak valid");
            break;
            }
    }
    void tampilctcar(){
        int jumlahharictcar;
        Scanner input = new Scanner(System.in);
        System.out.print("Sewa untuk berapa hari? : ");
        int jmhari=input.nextInt();
        jumlahharictcar=jmhari*sewa; 
        System.out.println("Harga sewa mobil: Rp."+jumlahharictcar);
    }
    void tampilsprtcar(){
        int jumlahharisprtcar;
        Scanner input = new Scanner(System.in);
        System.out.print("Sewa untuk berapa hari? : ");
        int jmhari=input.nextInt();
        jumlahharisprtcar=(int) (jmhari*mobil*hari);
        System.out.println("Harga sewa mobil: Rp."+jumlahharisprtcar);
    }
}
