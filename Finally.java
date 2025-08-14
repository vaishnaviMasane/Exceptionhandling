package com.exception;

public class Finally {
	public static void main(String[] args) {
		

try {
	int a=10;
	int b=0;
	int c=a/b;
}catch(Exception e)
{
	e.printStackTrace();
}finally
{
	System.out.println("I am in Finally Block");
}
System.out.println("Hello last line ");
}}
