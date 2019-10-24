package com;

import java.util.*;

//提供随机操作数

public class Signal {
//	int x;
//	int s;
	Random rand = new Random();//随机数
	double RandomS(int x, int s) {
		int f = rand.nextInt(2);
		if (s==0) {
			return rand.nextInt(x) + 1;//Math.random()*x+1;

		} else if (f==0) {
			return rand.nextInt(x) + 1;//Math.random()*x+1;

		} else {
			return (rand.nextInt(x) + 1) * -1;//(Math.random()*x+1)*-1;
		}
	}
}
