package com.TypesofArray;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= new int[2][2];
		matrix[0][0]=1;
		matrix[0][1]=2;
		
		matrix[1][0]=3;
		matrix[1][1]=4;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.println(matrix[i][j]+" \t");
			}
			System.out.println("\n\n");
		}
		
		
		

	}

}
