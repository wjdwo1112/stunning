package Baik;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_1417번_국회의원선거 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dasom = sc.nextInt();
		int[] list = new int [N-1];
		int cnt = 0;
		for (int i=0; i<list.length;i++) {
			list[i] = sc.nextInt();
			
		}
		
		if (N == 1) {
			System.out.println(cnt);
			return;
		}
		while(true) {
			Arrays.sort(list);
			int last = list.length-1;
			if(dasom>list[last])
				break;
			cnt++;
			list[last]--;
			dasom++;
			
			
		}
		System.out.println(cnt);
	}

}