package Baik;

import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_23351번_물주기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] Vase =  new int [N];
		
		int cnt = 0;
		
			for(int i=0; i<N; i++) {
				Vase[i] = K;
			}
			while(true) {
				for(int j=0; j<A; j++) {
					Vase[j] += B;
				}
				for(int k=0; k<N; k++) {
					Vase[k] -= 1 ;
					
			}
				Arrays.sort(Vase);
				cnt ++;
				
			if(Vase[0]==0)
				break;
		 }
			System.out.println(cnt);
		}
}