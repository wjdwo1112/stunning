package Baik;

import java.util.Scanner;

public class Main_백준_2563번_색종이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] square = new int [100][100];
		int cnt = 0;
		
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int k=x; k<x+10; k++) {
				for(int j=y; j<y+10; j++) {
					square[k][j] = 1;
				}
			}
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(square[i][j] == 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

}
}
