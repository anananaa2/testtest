package com.base;

public class A {
	  
    int age = 30;
	public static void main(String[] args) {
		A a = null;//NullpointerException발생하지않음
		//사용하면 그때 발생함.
		a = new A();
		System.out.println(a.age);//30
		System.out.println("여기는 보이나요?");//NullpointerException이  위에서 일어났을경우 이건 출력되지않음. 윗줄에서 동작을 멈췄으니까

	}

}
