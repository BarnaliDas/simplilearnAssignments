package com.TypeCastingPractise;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numeric="122";
		char letter = 'a';
		byte b=2;
		int i1=121,i2=0,i3=1;
		boolean bol=true;
		float f,f1=12/5;
		double d;
		System.out.println("Before conversion:");
		System.out.println("Value of letter ="+letter);
		System.out.println("Value of b ="+b);
		System.out.println("Value of i1 ="+i1);
		System.out.println("Value of i2 ="+i2);
		System.out.println("Value of i3 ="+i3);
		System.out.println("Value of f1 ="+f1);
		//converting datatype
		//Implicit or widening
		
		f=i1;
		d=f1;
		i2=b;
		i3=letter;
		System.out.println("Implicit Conversion:");
		System.out.println("Value of f ="+f);
		System.out.println("Value of d ="+d);
		System.out.println("Value of i2 ="+i2);
		System.out.println("Value of i3 ="+i3);
		
		//Explicit or narrowing
		f=(float)d;
		i1=(int)f;
		letter=(char)i1;
		b=(byte)i3;
		System.out.println("Explicit Conversion:");
		System.out.println("Value of f ="+f);
		System.out.println("Value of i1 ="+i1);
		System.out.println("Value of letter ="+letter);
		System.out.println("Value of b ="+b);
		

	}

}
