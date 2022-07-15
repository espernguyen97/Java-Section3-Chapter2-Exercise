import java.util.Scanner;

public class BaiTapTam {
	
	final static int MIN = -100;
	final static int MAX = 100;

	public BaiTapTam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		
		mang2k(a);

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

	public static int laDang2k (int x) {
		int du;
		if (x<1) {
			return 0;
		}
		if ( x==1) {
			return 1;
		}
		
		do {
			du = x%2;
			if(du !=0) {
				return 0;
			}
			x /=2;
			
		}while (x >=2);
		
		return 1;
	}
	
	public static void mang2k (int a[]) {
		boolean dang2k = true;
		int tam=-1;
		for (int i = 0; i < a.length; i++) {
			int soDangXet = laDang2k(a[i]);
			if(soDangXet == 0) {
				dang2k = false;
			} else if(soDangXet == 1) {
				tam = i;
				dang2k = true;
				break;
			}
		}
		
		if(dang2k == false) {
			System.out.println("Không có. Trả về 0.");
		} else {
			System.out.println("Giá trị đầu tiên dạng 2k là: "+ a[tam]);
		}
	}

}
