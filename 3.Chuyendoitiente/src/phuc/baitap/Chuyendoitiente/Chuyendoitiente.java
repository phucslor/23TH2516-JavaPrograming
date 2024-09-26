package phuc.baitap.Chuyendoitiente;
import java.util.Scanner;
public class Chuyendoitiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Example: USD to VND
		        double exchangeRate = 24000.0; // Example rate 1 USD = 24000 VND
		        System.out.println("Nhập số tiền USD: ");
		        double usd = scanner.nextDouble();
		        double vnd = usd * exchangeRate;
		        System.out.println(usd + " USD --> " + vnd + " VND");
		    }
		}

