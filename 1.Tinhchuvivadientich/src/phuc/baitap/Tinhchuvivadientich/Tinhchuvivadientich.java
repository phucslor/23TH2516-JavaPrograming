package phuc.baitap.Tinhchuvivadientich;
import java.util.Scanner;
public class Tinhchuvivadientich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        // Rectangle
	        System.out.println("Nhập chiều dài hình chữ nhật: ");
	        double length = scanner.nextDouble();
	        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
	        double width = scanner.nextDouble();
	        double perimeterRectangle = 2 * (length + width);
	        double areaRectangle = length * width;
	        System.out.println("Chu vi hình chữ nhật: " + perimeterRectangle);
	        System.out.println("Diện tích hình chữ nhật: " + areaRectangle);

	        // Circle
	        System.out.println("Nhập bán kính hình tròn: ");
	        double radius = scanner.nextDouble();
	        double perimeterCircle = 2 * Math.PI * radius;
	        double areaCircle = Math.PI * radius * radius;
	        System.out.println("Chu vi hình tròn: " + perimeterCircle);
	        System.out.println("Khu vực vòng tròn: " + areaCircle);
	}

}



     
