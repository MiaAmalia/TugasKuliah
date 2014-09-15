import java.util.Scanner;
class array_4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[][] data={{"SI", "Sistem Informasi", "2100000", "7", "300000"},
						 {"TI", "Teknik Informatika", "2500000", "7", "300000"},
						 {"KA", "Komputer Akuntansi", "1750000", "6", "200000"},
						 {"MI", "Manajemen Informatika", "1500000", "6", "250000"}
						};
		int [][] biaya={{2100000, 7, 300000},
						{2500000, 7, 300000},
						{1750000, 6, 200000},
						{1500000, 6, 250000}
						};
		String nama, kode, jurusan, nim;
		System.out.print(" Nama : "+nama);
		nama=input.next();
		System.out.print(" Nim  : "+nim);
		nim=input.next();
		System.out.print(" Kode : "+kode);
		kode=input.next();
	}
}