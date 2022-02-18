package com.coreJava.Test1;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        String word = s.next();
        int k = s.nextInt();
        
        String output = decrypt(word, k);
        System.out.println(output);
    }
	
	public static String decrypt(String encrypted, int k) {
    
	    char[] arr = encrypted.toCharArray();
	    
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
	    return String.valueOf(arr);
    }
}
