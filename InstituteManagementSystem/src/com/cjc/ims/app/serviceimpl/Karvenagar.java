package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc {
	
List<Course>cList=new ArrayList<>();
	
	public void addCourse()
	{
		Scanner sc=new Scanner(System.in);
		Course c=new Course();
		System.out.println("Enter Course id");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCname(sc.next());
		cList.add(c);
	}
	public void viewCourse()
	{
		Iterator<Course> itr= cList.iterator();
		while(itr.hasNext())
		{
			Course c=itr.next();
			System.out.println(c.getCid());
			System.out.println(c.getCname());
		}
	}
		
	List<Faculty> fList=new ArrayList<>();
	
	public void addFaculty()
	{
		Scanner sc=new Scanner(System.in);
		Faculty f=new Faculty();
		System.out.println("Enter Faculty id");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty Name");
		f.setFname(sc.next());
		fList.add(f);
	}
	public void viewFaculty()
	{
		Iterator<Faculty> itr= fList.iterator();
		while(itr.hasNext())
		{
			Faculty f=itr.next();
			System.out.println(f.getFid());
			System.out.println(f.getFname());
	}
	
		
		
		
	
	
	

}
}
