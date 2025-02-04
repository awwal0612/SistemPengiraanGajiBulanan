//aturcara ini ialah aturcara sistem pengiraan gaji bulanan
import java.util.*;
public class sistemPengiraanGajiBulanan{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);

		String namaPekerja;
		int bilanganHari;
		int jumlahGaji;

		System.out.print("Nama Pekerja: ");
		namaPekerja = input.nextLine();

		System.out.print("Masukkan Bilangan Hari Bekerja: ");
		bilanganHari = input.nextInt();

		if(bilanganHari<= 31) {
			jumlahGaji = bilanganHari*160;
		}	
	else {
			System.out.print("Bilangan hari tidak boleh melebihi 31 hari");
			System.out.println("Masukkan semula bilangan hari bekerja: ");

			bilanganHari = input.nextInt();
	        jumlahGaji=bilanganHari*160;
	}
	  System.out.println("Rumusan gaji bulanan bagi "+namaPekerja);
		    System.out.println("Jumlah hari bekerja "+bilanganHari);
		    System.out.println("GAJI SEBULAN ADALAH "+jumlahGaji);
		}
	}