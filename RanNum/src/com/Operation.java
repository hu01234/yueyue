package com;

public class Operation extends Calculator {
	
	void Add(double n1,double n2){
		num1=n1;
		num2=n2;
	}
	double getAdd(){
		return num1+num2;
	}
	void Sub(double n1,double n2){
		num1=n1;
		num2=n2;
	}
	double getSub(){
		return num1-num2;
	}
	void Mul(double n1,double n2){
		num1=n1;
		num2=n2;
	}
	double getMul(){
		return num1*num2;
	}
	void Div(double n1,double n2){
		num1=n1;
		num2=n2;
	}
	double getDiv(){
		if(num2==0){
			System.out.println("±»³ıÊıÎª0");
		}
	return num1/num2;
	}
}