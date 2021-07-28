package tcs;
import java.util.*;
public class anagram {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String one = sc.next();
	String two = sc.next();
	int count=0;
	if(one.length()==two.length()) {
		
	for(int i=0;i<one.length();i++) {
		for(int j=0;j<two.length();j++) {
			if(one.charAt(i) == two.charAt(j)) {
				count++;
			}
		}
	}
	int count1 = repeative(one,two);
	count = count - (count1*2);

		if(count==two.length()) {
			System.out.println("Anagram");
		}
	}
	else {
		System.out.println("Not a Anagram");
	}
	}
	public static int repeative(String one ,String two) {
		int count =0;
		for(int i=0;i<one.length();i++)
		for(int j=i+1;j<two.length();j++) {
			if(one.charAt(i) == one.charAt(j)) {
				count++;
			}
		}
		return count;
	}
}
