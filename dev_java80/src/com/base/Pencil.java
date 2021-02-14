package com.base;

public class Pencil {
	
	int length = 10;
	String penColor = "black";	
	
	int colorCount(double x) {
		return (int)x;
	}
	void company() {
		System.out.println("ZEPRI");
	}

	public static void main(String[] args) {
		Pencil p = new Pencil();
		
		System.out.println("Pencil");
		System.out.println("길이는 "+p.length+"입니다.\n"+"색깔은 "+p.penColor+"입니다.");
		
		int colNum = (int)1.333;
		System.out.println("색 갯수는 "+p.colorCount(colNum));
		System.out.print("광고회사는 ");
		p.company();
		
		
	}

}
