package com.base;

public class test {
	/* 괄호가 있는경우엔 3가지
	 * ():메소드
	 * ():생성자
	 * ():형전환=Casting 연산자
	 */

	public static void main(String[] args) {
		float f =3.14f;
		double d =3.14;
		f = d;
		//강제 형변환이 되었다.
		f = (float)d;//Casting 연산자
		//d = f;
		
	}

}
