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
			int n = N-i; //���л� �ʿ��� ���� -> n�� ���Ͻ� ���� ���� ���л���
			int m  = M-(K-i); //���л� �ʿ��� ���� -> m�� ���Ͻ� ���� ���� ���л���
			int result = Math.min(n/2, m);// ���� �� �ִ� ���� ���� ���ϱ�
				answer = Math.max(answer, result); 
		}
		System.out.println(answer);
	}

}

