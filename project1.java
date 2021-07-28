package tcs;
import java.util.*;
public class project1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		transform(arr);
		
	}
	public static void transform(int arr[]) {
		int n= arr.length;
		String[] arr2 = new String[n];
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i] == 0) {
				arr2[i] = "zero";
			}
				
			else if(arr[i] == 1) {
				arr2[i] = "one";
			}
			else if(arr[i] == 2) {
				arr2[i] = "two";
			}
			else if(arr[i] == 3) {
				arr2[i] = "three";
			}
			else if(arr[i] == 4) {
				arr2[i] = "four";
			}
			else if(arr[i] == 5) {
				arr2[i] = "five";
			}
			else if(arr[i] == 6) {
				arr2[i] = "six";
			}
			else if(arr[i] == 7) {
				arr2[i] = "seven";
			}
			else if(arr[i] == 8) {
				arr2[i] = "eight";
			}
			else if(arr[i] == 9) {
				arr2[i] = "nine";
			}
			else if(arr[i] == 10) {
				arr2[i] = "ten";
			}
		}
		int count = 0;
		for(int a=0;a<arr2.length;a++) {
			String temp = arr2[a];
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j) == 'a' ||temp.charAt(j) ==  'e'||temp.charAt(j) == 'i' ||temp.charAt(j) ==  'o' ||temp.charAt(j) ==  'u'){
				count ++;
			}
		}
		
	}
		System.out.println("Total number of vowels: "+count);
		int count1 =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == count) {
					count1++;
					System.out.println("Pairs: " + arr[i] + " + " + arr[j] );
				}
			}
		}
		System.out.println("total number of pairs: " + count1);
}
}
