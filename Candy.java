package Baik;

import java.util.Scanner;

	public class Candy {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			int C = 0;
			int cnt = 0;
			for (int i=1;i<N;i++) {
				  for(int j=3; j<N; j++){
				  C = N-i-j;
				  
				 if(C>0 && C%2==0 && i+j+C == N && j>=i+2) {
					 cnt++;
				 }
		
	              }
			}
			if(cnt==0) {
				System.out.println("0");
			}else {
				System.out.println(cnt);
			}
		}

	}


