import java.util.Scanner;

public class BaiTapHai {
	
	final static int MIN = -100;
	final static int MAX = 100;

	public BaiTapHai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);

		timChanDauTien(a);

	}
	

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0 = ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static void timChanDauTien(int a[]) {
		int indexChan = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				indexChan = i;
				break;
			}
		}
		if (indexChan == -1) {
			System.out.println("Không có");
		} else {
			System.out.println("Vị trí có giá trị chẵn đầu tiên là: \t" + indexChan);

		}
	}

}
