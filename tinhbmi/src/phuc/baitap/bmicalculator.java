package phuc.baitap;

import java.util.Scanner;

public class bmicalculator {

	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Họ tên: ");
		String hoTen= banPhim.nextLine();
		
		System.out.print("Chiều cao (m):");
		double chieuCao =  banPhim.nextDouble();
		
		System.out.print("Cân nặng (kg):");
		double canNang = banPhim.nextDouble();
		
		
		double bmi = canNang/ (chieuCao*chieuCao);
		
		
		System.out.println("Bạn " + hoTen);
		System.out.println("Có chỉ số BMI = " + bmi);
		
		
		if (bmi<18.5)
			System.out.println("Thiếu cân");
		else if (bmi<25) 
			System.out.println("Cân nặng bình thường");
		else if (bmi<30)
		System.out.println("Thừa cân, tiền béo phì");
		else if (bmi<35)
			System.out.println("Béo phì độ 1");
		else if (bmi<40)
			System.out.println("Béo phì độ 2");
		else System.out.println("Béo phì độ 3 (Bệnh lý");
		
		
	}

}