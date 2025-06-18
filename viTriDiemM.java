import java.util.Scanner;

public class viTriDiemM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double distance;
		
		System.out.print("Nhập tọa độ x và y của tâm (cách khoảng): \t");
		Double xTam = Double.parseDouble(scan.next());
		Double yTam = Double.parseDouble(scan.next());
		scan.nextLine();
		System.out.print("Nhập độ dài bán kính: \t");
		Double banKinh = Double.parseDouble(scan.nextLine());
		System.out.print("Nhập tọa độ x và y của điểm M (cách khoảng): \t");
		Double xDiemM = Double.parseDouble(scan.next());
		Double yDiemM = Double.parseDouble(scan.next());
		
		distance = Math.sqrt(Math.pow(xDiemM - xTam,2) + Math.pow(yDiemM - yTam,2));
		System.out.println(distance == banKinh ? "Điểm M nằm trên đường tròn" :
							distance < banKinh ? "Điểm M nằm trong đường tròn" : "Điểm M nằm ngoài đường tròn");
		
		scan.close();
	}

}
