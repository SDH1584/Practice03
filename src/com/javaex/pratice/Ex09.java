package com.javaex.pratice;

public class Ex09 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=10 ; i++) 
		{
			System.out.println(i+"\t");
			
			for(j=i+1; j<i+10; j++) 
			{
				System.out.print(j+"\t");
			}
		}
	}		
}