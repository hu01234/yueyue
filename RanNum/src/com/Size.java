package com;
public class Size extends Result{
	Signal n1 = new Signal(); // �漴�ṩ������
	Signal n2 = new Signal();
	Operator op = new Operator();// ����ṩ�������
	DisRepeat dr=new DisRepeat();
	int field, count, fu;//filed ȡֵ��Χ  count ��Ŀ����   fu �Ƿ��������
	int rule, whe;  //  rule ѡ�����ı���  whe �ж���Ҫ�����
	double num1, num2, resu;//resu ���
	char fuaho;
	double getResult(){
		for (int i = 1; i <= count; i++) {
			num1 = n1.RandomS(field, fu);
			num2 = n2.RandomS(field, fu);
			fuaho = op.Operator(rule);
			dr.DisRepeat(num1, fuaho, num2);//ȡ���ظ�
			Result result = new Result(num1, fuaho, num2, whe);
			resu = result.getResult();
			//�жϷ�Χ
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
			System.out.println("���������Χ");
			continue;
		}
		return resu;
	}
}
