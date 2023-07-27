package Baik;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[5];
		int cnt = 0;
		
		int n = 1;
		for(int i=0; i<5; i++) {
			list[i] = sc.nextInt();
		}
		
		while(true) {
			for(int i=0; i<5; i++) {
				if(n%list[i] == 0) {
					cnt++;
				}
			}
				if(cnt>=3) {
					
					break;
				}else {
					cnt = 0;
					n++;
				}
			
			
		}
		System.out.println(n);
	}
}
