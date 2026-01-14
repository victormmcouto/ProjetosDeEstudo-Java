package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[][] matrix = new int[n][p];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<p; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int numToSearch =  sc.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<p; j++) {
				if (matrix[i][j] == numToSearch) {
					System.out.println("Position " + i + "," + j + ":");
					//i - 1 >= 0
					if (i > 0) { //i > 0 (se é maior que 0, há como subtrair)
						System.out.println("Up: " + matrix[i - 1][j]);
					} 
					//i + 1 <= n - 1
					if (i < matrix.length - 1) { //i < matrix.length (se é menor que o máx, tem como adiocionar)
						System.out.println("Down: " + matrix[i + 1][j]);
					} 
					//j - 1 >= 0
					if (j > 0) { 
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					//j + 1 <= p - 1
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
				}
			}
		}
		//https://github.com/acenelio/matrix2-java
		sc.close();
	}

}
