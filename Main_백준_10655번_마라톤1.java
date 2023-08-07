package Baik;

import java.util.Scanner;

public class Main_백준_10655번_마라톤1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		int N = sc.nextInt();
		int[][] arr = new int [N][2];
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		
		for(int i=0; i<N-1; i++) {
			a += Math.abs(arr[i][0]-arr[i+1][0]) + Math.abs(arr[i][1]-arr[i+1][1]);
		}
		
		for(int i=1; i<N-1; i++) {
			
				
				b = Math.abs(arr[i][0]-arr[i-1][0]) + Math.abs(arr[i][1]-arr[i-1][1])
				+ Math.abs(arr[i][0]-arr[i+1][0])+ Math.abs(arr[i][1]-arr[i+1][1]);
				c = Math.abs(arr[i-1][0]-arr[i+1][0])+Math.abs(arr[i-1][1]-arr[i+1][1]);
				
				min = Math.min (min, a-b+c);
			
		}
		System.out.println(min);
		}
}
