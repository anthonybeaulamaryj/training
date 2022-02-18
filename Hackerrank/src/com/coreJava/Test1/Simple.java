package com.coreJava.Test1;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String encrypted = sc.next();
		char[] arr = encrypted .toCharArray();
		int k = sc.nextInt();
	    
	    k = k%26;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        int num = 0;
	        int ch = (int)arr[i];
	        
	        if(ch >= 65 && ch <=90)
	        {
	            num = (int)arr[i] - k;
	            if(num<65) num += 26;
	            arr[i] = (char)num;
	        }
	        else if(ch >= 97 && ch <= 122)
	        {
	            num = (int)arr[i] - k;
	            if(num<97) num += 26;
	            arr[i] = (char)num;
	        }
	    
	    }
	    System.out.println( String.valueOf(arr));
	    }
	
	
}
