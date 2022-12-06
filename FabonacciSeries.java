package com.bridgelabz.logicalproblems;
    import java.util.Scanner;

public class FabonacciSeries {
	void display() {
		int term, a=0, b=1, c;
		System.out.println("Enter the number");
		Scanner r = new Scanner(System.in);
		term=r.nextInt();
		for(int i =1; i<=term; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
		public static void main(String[] args) {
			FabonacciSeries series = new FabonacciSeries();	
			series.display();
		}

	}


