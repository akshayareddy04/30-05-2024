import java.util.Scanner;

public class OddPositionsCharacterCount {
	    public static void main(String[] args) {
	        System.out.println("enter a string");
	        Scanner s=new Scanner(System.in);
	        String str=s.nextLine();
	        char[] arr=str.toCharArray();
	        for(int i=0;i<arr.length;i=i+2)
	        {
	        	System.out.println(arr[i]);
	        }
	    }
}
