package phuc.baitap.ChisokhoicotheBMI;
import java.util.Scanner;
public class ChisokhoicotheBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Nhập cân nặng của bạn: ");
		        double weight = scanner.nextDouble();

		        System.out.println("Nhập chiều cao của bạn: ");
		        double height = scanner.nextDouble();

		        double bmi = weight / (height * height);
		        System.out.println("BMI của bạn là: " + bmi);

		        if (bmi < 18.5) {
		            System.out.println("Bạn bị thiếu cân.");
		        } else if (bmi >= 18.5 && bmi < 24.9) {
		            System.out.println("Bạn có cân nặng bình thường.");
		        } else if (bmi >= 25 && bmi < 29.9) {
		            System.out.println("Bạn thừa cân.");
		        } else {
		            System.out.println("Bạn béo phì.");
		        }
		    }
		}
