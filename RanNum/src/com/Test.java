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
		

		System.out.println("������ȡֵ��Χ:");
		size.field = reader.nextInt();
		
		System.out.println("������������Ŀ����:");
		size.count = reader.nextInt();
		
		
		System.out.println("�Ƿ��������(1 ��  0 ��):");
		size.fu = reader.nextInt();
		
		
		System.out.println("�������������������㣨�������˳�����:(4 ����   2 ����):");
		size.rule = reader.nextInt();
		
		
		System.out.println("�Ƿ�����𰸣�1=�ǣ�0=��):");
		size.whe = reader.nextInt();
		
		System.out.println("���}�ɹ���ת��result" );
		System.setOut(pr);
		size.getResult();
		
		// TODO Auto-generated method stub

	}

}
