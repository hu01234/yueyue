
package com;

import java.util.Random;


public class Operator extends Calculator {
	int rule;
	char fuhao;
	Random rand = new Random();

	public Operator() {
		// TODO Auto-generated constructor stub
	}

	char Operator(int rule) {//随机生成运算符

		char c[] = { '+', '-', '*', '/' };
		switch (rule) {
		case 1:
		case 2:
			fuhao = c[rand.nextInt(2)];
			break;
		case 3:
		case 4:
			fuhao = c[rand.nextInt(4)];
			break;
		}
		return fuhao;

	}
}