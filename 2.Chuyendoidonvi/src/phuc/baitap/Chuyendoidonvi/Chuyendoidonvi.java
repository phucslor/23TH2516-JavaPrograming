package phuc.baitap.Chuyendoidonvi;
import java.util.Scanner;
public class Chuyendoidonvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Km to meters
        System.out.println("Nhập km: ");
        double km = scanner.nextDouble();
        double meters = km * 1000;
        System.out.println(km + " km --> " + meters + " m");

        // Bytes to bits
        System.out.println("Nhập byte: ");
        double bytes = scanner.nextDouble();
        double bits = bytes * 8;
        System.out.println(bytes + " byte --> " + bits + " bit");
	}

}




        
