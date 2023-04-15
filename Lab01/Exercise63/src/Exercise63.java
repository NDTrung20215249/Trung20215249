import java.util.Scanner;
public class Exercise63 {
	public static void main(String[] args) {
		Scanner giatri = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = giatri.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            for (int j=1; j<=n-i; j++) {
	                System.out.print(" ");
	            }
	            for (int p = 1; p <= 2*i-1; p++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
