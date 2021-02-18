package com.base;

public class Ggd {
		int a;
		int b;
		
	public static void main(String[] args) {
		Ggd g = new Ggd();
		for(g.a=2;g.a<10;g.a++) {
			for(g.b=1;g.b<10;g.b++) {
				System.out.print(g.a*g.b+ " ");
			}
			System.out.println();
		}
		System.out.println();System.out.println();System.out.println();System.out.println();
		int i = 2;
		int j = 1;
		while(i<10) {
			while(j<10) {
				
				System.out.print(i*j + " ");
				j++;
		}
			i++;
			j=1;
			System.out.println();
		}

	}

}
