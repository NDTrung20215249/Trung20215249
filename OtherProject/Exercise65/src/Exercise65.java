import java.util.Arrays;
import java.util.Scanner;

public class Exercise65 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = nhap.nextInt();
		
		int arr[] = new int[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Enter number " + (i+1));
			arr[i] = nhap.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		float average = (float) sum / n;
		
		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + average);

	}

}