package Baik;

import java.util.Scanner;

public class Farm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int cnt = 0;
		int sheep = 0;
		int goat = 0;
	   
	   for(int i=1; i<n; i++) {
		   for(int j=1; j<n; j++) {
			  if( (i + j == n) && (a*i + b*j == w)) {
				  cnt ++;
				  sheep = i;
				  goat = j;
				  
			  } 
			   
		   }
		 
	   }
	   if(cnt == 1) {
		   System.out.println(sheep +" " +goat);
	   }else {
		   System.out.println("-1");
	   }
	 
	}
}
