import java.util.Scanner;

public class BaiTapChin {
	
	final static int MIN = -100;
	final static int MAX = 100;

	public BaiTapChin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);

		timSoNguyenToNhoNhat(a);

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
	
	public static void timSoNguyenToNhoNhat (int a[]){
		int b[] = new int [a.length];
		for (int i = 0 ; i < a.length; i++) {
			if (isPrime(a[i])) {
				b[i]= a[i];
			}
		}
		System.out.println("Các số nguyên tố tìm được là:");
		xuatMang(b);
		
		int indexPrimeMin = 0;
		for (int i=0; i<b.length; i++) {
			if (b[i]< indexPrimeMin) {
				indexPrimeMin = i;
			}
		}
		System.out.println(b[indexPrimeMin]);
		
		int soCanTim =0;
		boolean thoaDk = false;
		for (int i=0; i<a.length; i++) {
			if (b[indexPrimeMin]> a[i]) {
				soCanTim = b[indexPrimeMin];
				thoaDk = true;
			}
		}
		
		if (!thoaDk) {
			System.out.println(soCanTim);
		}
		
		
	}

}
