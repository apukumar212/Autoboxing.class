package com.pack1;

public class Autoboxing 
{
void meth1()
{
	System.out.println("Implementing Auto-Boxing");
	int i=10;
	Integer ival1=i; //1st way
	Integer ival2=Integer.valueOf(i);//2nd way
	Integer ival3=new Integer(i);//3rd way
	System.out.println("Int PDT value:"+i);
	System.out.println("integer WCO value ival1:"+ival1);
	System.out.println("integer WCO value ival2:"+ival2);
	System.out.println("integer WCO value ival3:"+ival3);
	System.out.println("--------------------------------");
	
	char c='A';
	Character cval1=Character.valueOf(c);
	Character cval2=new Character(c);
	System.out.println("Char PDT value:"+c);
	System.out.println("Character WCO value cval1:"+cval1);
	System.out.println("Character WCO value cval2:"+cval2);
	System.out.println("---------------------------------");
	System.out.println("---------------------------------");
	
	Integer ival4=Integer.valueOf(50);
	Byte bval1=Byte.valueOf((byte)50);
	Float fval1=Float.valueOf(10.9f);
	System.out.println("Integer WCO value ival4:"+ival4);
	System.out.println("Byte WCO value bval1:"+bval1);
	System.out.println("Float WCO value fval1:"+fval1);
	System.out.println("---------------------------------");
	 
	Integer ival5=Integer.valueOf("100");
	Byte bval2=Byte.valueOf("100");
	Float fval2=Float.valueOf("100");
	System.out.println("Integer WCO value ival4:"+ival5);
	System.out.println("Byte WCO value ival1:"+bval2);
	System.out.println("Float WCO value ival1:"+fval2);
}
public static void main(String[] args) 
{
	Autoboxing aobj=new Autoboxing();
	aobj.meth1();
}
}












