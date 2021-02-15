package stringHandling;

import java.util.Scanner;

//WAP to accept String From user and count and print digits of string
/*
* enter a string - Coder1234
* No of Digit of String is 4
* 
* hw count,alphabets,capital alphabets,small alphabet space and special symbol
*/
public class DigitsOfString8 {
	public static void main(String[] args) {
		String str;
		int digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			//here charAt method will return ASCII code
			if(str.charAt(i)>47 && str.charAt(i)<58)
			{
				digit++;
			}
		}
		System.out.println("No of Digit in sr is: "+digit);
	}

}
