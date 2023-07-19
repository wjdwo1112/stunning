package Baik;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
        int spy1 = 0;
        int spy2 = 0;
		int sum = 0;
		for(int i=0; i<9; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}
		for(int i=0; i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if((sum - height[i]-height[j] == 100)){
					spy1 = i;
					spy2 = j;
                    break;
				}
			}
			Arrays.sort(height);
		}
		for(int i=0;i<9;i++) {
            if(i==spy1 || i==spy2){
                continue;
            }
	System.out.println(height[i]);
	}
	}
}
