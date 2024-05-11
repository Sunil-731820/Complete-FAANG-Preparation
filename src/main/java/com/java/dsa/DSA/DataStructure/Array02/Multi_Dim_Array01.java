package com.java.dsa.DSA.DataStructure.Array02;

public class Multi_Dim_Array01 {
	public static void main(String[] args) {
		System.out.println("This is The EXample of the Multi_Dim_Array.java");
		int[][] multidimentionsArray = {
				{
					1,2,3,
				},
				{
					3,4,5
				},
				{
					6,7,8
				}
		};
		System.out.println("The Two Dimensional Array is ");
		System.out.println(multidimentionsArray);
		
//		Iterating The Two Dimensional Array 
		for(int i=0;i<multidimentionsArray[0].length;i++) {
			for(int j=0;j<multidimentionsArray[0].length;j++) {
				System.out.println("The Element in The Array is "+ i + j + " : "+multidimentionsArray[i][j]);
			}
		}
	}

}
