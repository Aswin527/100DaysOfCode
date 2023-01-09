package sample.demo.stringrev.StringRev;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RevString {

	public static void main(String[] args) {
		RevString rs=new RevString();  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String  str=sc.nextLine();    
		System.out.println(rs.reversestr(str));   
	}
	
	static String reversestr(String str)  
	{  
		Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
	}  

}
