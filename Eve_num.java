package Guvi;

import java.util.Scanner;

public class Eve_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the m:");
m=sc.nextInt();
System.out.println("Enter the n:");
n=sc.nextInt();
for(num=m;num<=n;num++)
       {
        if(num%2==0)
        {System.out.println(num);}
}
}
}
