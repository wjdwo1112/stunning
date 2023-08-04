package Baik;

import java.util.Scanner;

public class ContestOrInternship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int answer = 0;
		
		for(int i=0; i<=K; i++) {
			int n = N-i; //여학생 쪽에서 뺴기 -> n은 인턴십 가고 남은 여학생수
			int m  = M-(K-i); //남학생 쪽에서 뺴기 -> m은 인턴십 가고 남은 남학생수
			int result = Math.min(n/2, m);// 만들 수 있는 팀의 개수 구하기
				answer = Math.max(answer, result); 
		}
		System.out.println(answer);
	}

}

