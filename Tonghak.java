package Baik;

import java.util.Scanner;

public class Tonghak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//완전탐색으로 풀어보기
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		for (int i=-1000; i<=1000; i++) {
			if((i*i+2*A*i+B) == 0) {
				System.out.print(i);
				System.out.print(" ");
				
			}
		}
		
		
	}

}
