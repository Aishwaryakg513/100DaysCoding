/*return the alphabetic number sum
input : aish
output: 37
*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
		    sum+= s.charAt(i)-'a'+1;
		}
		System.out.println(sum);
		
	}
}

