package com;

public class DisRepeat extends Signal{
	public void DisRepeat (double num1,char fuhao,double num2){
		double a[][]=new double[100][3];//������ŵ�����
		int m=0;//��¼Ԫ�ظ���
		int n;//�������±�
		while(m<=a.length){
			for(n=0;n<m;n++){
				if(a[n][0]==num1&&a[n][1]==fuhao&&a[n][2]==num2){//�ж��Ƿ����
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
