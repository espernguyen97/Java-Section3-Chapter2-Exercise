import java.util.Scanner;

public class BaiTapBon {
	
	final static int MIN = -100;
	final static int MAX = 100;

	public BaiTapBon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);

		timSoNguyenToCuoiCung(a);

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
	
	public static void timSoNguyenToCuoiCung (int a[]){
		int indexPrime = -1;
		for (int i = a.length -1; i >0; i--) {
			if (isPrime(a[i])){
				indexPrime = i;
				break;
			}
		}
		
		if (indexPrime == -1) {
			System.out.println("Không có");
		} else {
			System.out.println("Vị trí có chứa số nguyên tố cuối cùng là: \t" + indexPrime);

		}
	}

}
