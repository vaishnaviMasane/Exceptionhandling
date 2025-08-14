package com.exception;

public class Scenario1 {
	public static void main(String[] args) {
		
Scenario1 t1=new Scenario1();
try {
t1.divide();
	}catch(Exception e)
{
	System.out.println(e.getMessage());
}}
void divide()
{
int a=10;
int b=0;
int c=a/b;
}

}
