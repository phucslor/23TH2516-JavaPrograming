package phuc_baicoban;

import java.util.Scanner;

public class nhapxuathoten {

	public static void main(String[] args) {
		System.out.println("---nhap xuat---");
		// TODO Auto-generated method stub
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		
		Scanner banPhim;
		banPhim = new Scanner(System.in);
		
		System.out.print("ho ten ? ");
		hoTen = banPhim.nextLine();
		System.out.print("tuoi ? ");
		tuoi = banPhim.nextInt();
		System.out.print("chieu cao (m)? ");
		chieuCao = banPhim.nextDouble();
		System.out.print("can nang (kg)? ");
		canNang = banPhim.nextDouble();
		
		System.out.println("================");
		System.out.println("Name: " + hoTen);
		System.out.println("Age: " + tuoi);
		System.out.println("Weight " + canNang);
		System.out.println("Height: " + chieuCao);
		System.out.println("================");
	}

}
