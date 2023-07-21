package Baik;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			double A;
			int cnt = 0;
			for(int i=1; i<=500; i++) {
				
//				for( int j=1; j<i; j++) {
//					if(i*i-N == j*j) {
//						cnt++;
//					}
				A = Math.sqrt(i*i+N);
				if(A%1==0) {
					cnt++;
				}
			
			
			}
			System.out.println(cnt);
	}

}
