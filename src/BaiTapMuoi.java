import java.util.Scanner;

public class BaiTapMuoi {
	
	final static int MIN = -10000;
	final static int MAX = 10000;
	final static int giaTri2020 = 2020;

	public BaiTapMuoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);

		timChiSoLonHon2020(a);

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

	public static void timChiSoLonHon2020(int a[]) {
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > giaTri2020) {
				index = i;
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Không có. \t " + flag);
		} else {
			System.out.println("Giá trị \t" + a[index] + " \t tại chỉ số \t" + index + "\t thỏa điều kiện");
		}
	}

}
