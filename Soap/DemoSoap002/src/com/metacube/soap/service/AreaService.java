package com.metacube.soap.service;

public class AreaService
 {
   public String sayHello()
	{
		return "Hello GET-2019";
	}
   public double area(int a,int b,int c)
    {
	 double s = (a+b+c)/2;
	 double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 return area;
    }
 }
