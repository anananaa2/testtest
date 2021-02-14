package com.base;

public class Temp {//Value Object, 값을 ??하는 클래스이기때문에 메소드가 필요없다.
	String t_date=null;
	int location=0;//초기값은 0
	float t_avg = 0.0f; //2^31-1 double과 구별하기 위해 float는 f를 달고 float에 f를 달았기때문에
	double t_high = 0.0d; //d는 생략 가능
    double t_low = 0.0; //t_는 식별자로 붙였다 date만 적으면 무슨 날짜인지 모르니까

}
