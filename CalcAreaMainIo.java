package com.sd.io; 

import java.util.Scanner; 

public class CalcAreaMainIo { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("input your radius: "); 
		double r = sc.nextDouble(); 
		double area = Math.PI * Math.pow(r,2); 
		System.out.printf("radius : %.2f area:%.2f",r,area); 
	} 
} 
