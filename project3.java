package tcs;
import java.util.*;
public class project3 {
	//trainee
	public static void main(String[] args) {
		int arr[] = new int[9];
		int num1 =0;
		int num2 =0;
		int num3 =0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the values : ");
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<=arr.length-1;j=j+3) {
			num1 += arr[j];
			if(j!=arr.length-2) {
				num2 += arr[j+1];
			}
			if(j!=arr.length-2) {
				num3+=arr[j+2];
			}
			
		}
		num1 = num1/3;
		num2=num2/3;
		num3=num3/3;
		if(num1 <71 || num2>100) {
			num1=0;
		}
		else if(num2<71 || num2>100) {
			num2 =0;
		}
		else if(num3 <71 || num3>100) {
			num3=0;
		}
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("1st person: " + num1);
			if(num1 == num2) {
				System.out.println("2nd person "+ num2);
			}else if(num1 == num3) {
				System.out.println("3rd person " + num3 );
			}
		}
		else if(num2>num1 && num2 >num3) {
			System.out.println("2nd person: "+ num2);
			if(num2 == num1) {
				System.out.println("1st person " + num1);
			}else if(num2 ==num3) {
				System.out.println("3rd person " + num3);
			}
		}
		else {
			System.out.println("3rd person: " + num3);
			if(num3 == num1) {
				System.out.println("1st person " + num1);
			}
			else if(num3 == num2) {
				System.out.println("2nd person "+ num2);
			}
		}
	}

}
