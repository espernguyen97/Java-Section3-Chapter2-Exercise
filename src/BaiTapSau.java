import java.util.Scanner;

public class BaiTapSau {
	
	final static int MIN = -100;
	final static int MAX = 100;

	public BaiTapSau() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);

		timDoanChuaPhanTu(a);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  = ");
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

	public static boolean isPrime(int x) {
		boolean checkPrime = true;
		x = Math.abs(x);
		if (x < 2) {
			checkPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				checkPrime = false;
			}
		}
		return checkPrime;
	}

	public static void timDoanChuaPhanTu(int a[]) {
		int indexMax = 0;
		int indexMin = 0;
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[indexMin]) {
				indexMin = i;
			}
			if (a[i] > a[indexMax]) {
				indexMax = i;
			}

		}
		if (Math.abs(a[indexMin]) > Math.abs(a[indexMax])) {
			x = indexMin;
		} else {
			x = indexMax;
		}

		System.out.println("Giá trị để đoạn [-x,x] chứa tất cả các giá trị trong mảng là: " + Math.abs(a[x]));

	}


}
