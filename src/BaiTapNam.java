import java.util.Scanner;

public class BaiTapNam {

	public BaiTapNam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int x = nhapX(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);

		timGiaTriGanX(a, x);

	}
	
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  = ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int nhapX(Scanner scan) {
		int x;

		System.out.print("Nhập giá trị x = ");
		x = Integer.parseInt(scan.nextLine());

		return x;
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

	public static void timGiaTriGanX(int a[], int x) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.abs(a[i] - x);
		}

		int indexMin = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < b[indexMin]) {
				indexMin = i;
			}
		}

		System.out.println("Các phần tử gần  giá trị x = " + x + " là: \t");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == b[indexMin]) {
				System.out.println("(" + i + "," + a[i] + ")");
			}
		}

	}
	
	

}
