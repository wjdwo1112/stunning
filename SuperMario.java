package Baik;

import java.util.Scanner;

public class SuperMario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¿ÏÀüÅ½»öÀ¸·Î Çª¸®
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [10];
		int[ ] result = new int [10];
		int [] subtract = new int [10];
		int min = 100-result[0];
		int cnt = 0;
        int sum = 0;
		for(int i=0; i<10; i++) {
			 a[i] =  sc.nextInt();
			 sum += a[i];
            result[i] = sum;
			 subtract[i] = 100 - result[i];
			 if(Math.abs(min) >= Math.abs(subtract[i])) {
				 min = subtract[i];
				 cnt = i;
			 }
			 }
			System.out.println(result[cnt]);
	}

}

