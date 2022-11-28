//To find the frequency of a given character in a given string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string: ");
	    String st = sc.nextLine();
	    System.out.print("Enter a character to find its frequency: ");
	    char c = sc.next().charAt(0);
	    int count=0;
	    for(int i=0;i<st.length();i++)
	    {
	        if(st.charAt(i)==c)
	        {
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}