package Guvi;

import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,size=0,flag=0,temp=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array:");
       size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the numbers");
       for(i=0;i<size;i++) 
    	    arr[i]=sc.nextInt();
       {
	for(i=0;i<size;i++){
    	   for( j = i+1;j<size;j++){
    		   if(arr[i]==arr[j])
    		   {
    			   temp=arr[i];
    			   flag=1;
    			   break;
    		   }
    	   }}
    	   if(flag==1)
    	   {
    		   System.out.println("Repeated number is:"+temp);
    	   }	   
    	 sc.close();
	}

       }}                 