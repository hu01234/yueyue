package com;

public class Result extends Calculator {
	int whe;//whe 判断需要输出答案
	double res;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(double num1, char fuhao, double num2,  int whe) {
		this.num1 = num1;
		this.num2 = num2;
		this.fuhao = fuhao;
		this.whe = whe;
	}

	double getResult() {
		Operation o=new Operation();
		double res = 0;
		if (whe==0) {
			System.out.println("");
		} 
		else{
			switch (fuhao) {
			case '+':
				o.Add(num1, num2);
				 res = o.getAdd();
				break;
			case '-':
				o.Sub(num1, num2);
				res = o.getSub();
				break;
			case '*':
				o.Mul(num1, num2);
				res =o.getMul();
				break;
			case '/':
				o.Div(num1, num2);
				res = o.getDiv();
				break;

			}
			
		}
		return res;
	}
}
