package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenagar;


public class Test {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
        Cjc c1= new Karvenagar();
		
        while(true)
		{
			System.out.println("1.addCourse\n2.viewCourse\n3.exit");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				c1.addCourse();
				break;
	
			case 2:
				c1.viewCourse();
				break;
				
			case 3:
				System.exit(0);
	            break;
	
			default:
				System.out.println("Invalid Choice");
				break;
	
			}
		}
	}
}
	

