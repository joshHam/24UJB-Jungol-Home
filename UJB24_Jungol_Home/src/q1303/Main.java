package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.close();

		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
//				System.out.print(k + " ");
//				k++;
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

}
