package com.challenge.array.MatrixMultiply;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{2,4,6},{8,10,12},{14,16,18}};    
		int c[][]=new int[3][3];  
		        
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}  
				System.out.print(c[i][j]+"\t");  //printing matrix element  
			}  
		System.out.println();//new line    
		}
	}

}
