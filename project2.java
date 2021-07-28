package tcs;
import java.util.*;
public class project2 {
//candlesproblemtcs 
	//4.26min
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		for(;;) {
		int num = sc.nextInt();
		if(num>n ) {
			System.out.println("out of stock:");
			continue;
		}
		if(num<= 0) {
			System.out.println("Invalid input");
		}
		else{
			n = n-num;
			System.out.println("Number of candles left: "+n);
			if(n<=5) {
				n = 10;
			}			
		}}
		}
}
