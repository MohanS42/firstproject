package Guvi;

import java.util.Scanner;

public class Odd_number_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number m");
		m=sc.nextInt();
		System.out.println("enter the n");
		n=sc.nextInt();
		for(num=m;num<=n;num++)
		{
			if(num%2==1)
			{System.out.println(num);}
		}
	}
}



