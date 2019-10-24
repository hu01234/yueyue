package com;

public class DisRepeat extends Signal{
	public void DisRepeat (double num1,char fuhao,double num2){
		double a[][]=new double[100][3];//把数存放到数组
		int m=0;//记录元素个数
		int n;//数组行下标
		while(m<=a.length){
			for(n=0;n<m;n++){
				if(a[n][0]==num1&&a[n][1]==fuhao&&a[n][2]==num2){//判断是否相等
					continue;
				}
				a[n][0]=num1;
				a[n][1]=(double)fuhao;
				a[n][2]=num2;
			}
			m++;
			num1=a[a.length-1][0];
			fuhao=(char)a[a.length-1][1];
			num2=a[a.length-1][2];
		}
	}
	
}
