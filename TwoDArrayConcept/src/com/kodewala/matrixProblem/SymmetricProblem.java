package com.kodewala.matrixProblem;

public class SymmetricProblem {
	
	 static boolean isSymmetricMatrix(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(matrix[i][j]);
				System.out.println(matrix[i][j]);
				if(matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{2,5,6},{3,6,9}};
		
		if(isSymmetricMatrix(matrix)) {
			System.out.println("Yes it is ");
		}else {
			System.out.println("Not");
		}
	}

}
