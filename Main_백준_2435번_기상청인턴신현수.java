package Baik;

public class Main_백준_2435번_기상청인턴신현수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] temp = new int [N]; 
		int max = -10000;
		int[] sum = new int[N-K+1];
		for(int i=0;i<N;i++) {
			temp[i] = sc.nextInt();
		}
		for(int i=0; i<N-K+1;i++) {
			for(int j=i;j<i+K; j++) {
				sum[i] += temp[j];
			
				if(i+K>N) {
					break;
				}
				
		}
				
			max = Math.max(max,sum[i]);
			
			
			
}
		
		
		System.out.println(max);
		sc.close();
}
}