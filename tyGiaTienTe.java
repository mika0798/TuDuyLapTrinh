import java.util.Scanner;

public class tyGiaTienTe {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		final int TY_GIA = 23_500;
		double soTienVND = 1.0;
		
		System.out.println("Chuyển đổi tiền từ USD sang VND");
		System.out.print("Nhập vào số tiền USD: \t");
		double soTienUSD = Double.parseDouble(nhap.nextLine());
		soTienVND = soTienUSD * TY_GIA;
		System.out.printf("Số tiền chuyển sang VND là: %,.2f VND",soTienVND);
		
		nhap.close();

	}

}
