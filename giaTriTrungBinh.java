import java.util.Scanner;

public class giaTriTrungBinh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TONG_SO = 5;
		int sum = 0;
		float avg;
		
		System.out.println("Tính trung bình cộng của 5 số nguyên");
		System.out.print("Nhập số thứ nhất: \t");
		int so1 = Integer.parseInt(scan.nextLine());
		sum += so1;
		System.out.print("Nhập số thứ hai: \t");
		int so2 = Integer.parseInt(scan.nextLine());
		sum += so2;
		System.out.print("Nhập số thứ ba: \t");
		int so3 = Integer.parseInt(scan.nextLine());
		sum += so3;
		System.out.print("Nhập số thứ tư: \t");
		int so4 = Integer.parseInt(scan.nextLine());
		sum += so4;
		System.out.print("Nhập số thứ năm: \t");
		int so5 = Integer.parseInt(scan.nextLine());
		sum += so5;
		
		avg = 1.0f * sum / TONG_SO; 
		System.out.print("Giá trị trung bình là: \t" + avg);
		
		scan.close();

	}

}
