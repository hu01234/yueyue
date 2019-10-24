package com;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws FileNotFoundException{
		
		PrintStream pr=new PrintStream("e:/result.txt");
		Scanner reader = new Scanner(System.in);
		
		Size size=new Size();
		

		System.out.println("请输入取值范围:");
		size.field = reader.nextInt();
		
		System.out.println("请输入生成题目数量:");
		size.count = reader.nextInt();
		
		
		System.out.println("是否包含负数(1 是  0 否):");
		size.fu = reader.nextInt();
		
		
		System.out.println("生成四则运算或二则运算（不包含乘除法）:(4 四则   2 二则):");
		size.rule = reader.nextInt();
		
		
		System.out.println("是否输出答案（1=是，0=否):");
		size.whe = reader.nextInt();
		
		System.out.println("出題成功，转至result" );
		System.setOut(pr);
		size.getResult();
		
		// TODO Auto-generated method stub

	}

}
