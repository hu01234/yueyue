package com;
public class Size extends Result{
	Signal n1 = new Signal(); // 随即提供操作数
	Signal n2 = new Signal();
	Operator op = new Operator();// 随机提供运算符号
	DisRepeat dr=new DisRepeat();
	int field, count, fu;//filed 取值范围  count 题目数量   fu 是否包含负数
	int rule, whe;  //  rule 选择语句的变量  whe 判断需要输出答案
	double num1, num2, resu;//resu 结果
	char fuaho;
	double getResult(){
		for (int i = 1; i <= count; i++) {
			num1 = n1.RandomS(field, fu);
			num2 = n2.RandomS(field, fu);
			fuaho = op.Operator(rule);
			dr.DisRepeat(num1, fuaho, num2);//取消重复
			Result result = new Result(num1, fuaho, num2, whe);
			resu = result.getResult();
			//判断范围
			if (resu < 100) {
			if (num1 >= 0) {
				System.out.print(num1);
			} else {
				System.out.print("(" + num1 + ")");
			}
			System.out.print(fuaho);
			if (num2 >= 0) {
				System.out.print(num2 + "=" );
			} else {
				System.out.print("(" + num2 + ")" + "=" );
			}
			if(whe==0){
				System.out.println("");
			}else{
				System.out.println(resu);
			}

		} else
			System.out.println("结果超出范围");
			continue;
		}
		return resu;
	}
}
