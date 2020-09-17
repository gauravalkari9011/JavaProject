package array;

public class ArrayMultiDimentional {

	public static void main(String[] args) {
			//creating two matrices  
			int a[][]={{1,3,4},{3,4,5}};  
			int b[][]={{1,3,4},{3,4,5}};  
			  
			//creating another matrix to store the sum of two matrices  
			int c[][]=new int[2][3];  
			  
			//adding and printing addition of 2 matrices  
			for(int i=0;i<2;i++){  
			for(int j=0;j<3;j++){  
			c[i][j]=a[i][j]+b[i][j];  
			System.out.print(c[i][j]+" ");  
			}  
			System.out.println();//new line  
			}  		  
			
			System.out.println("************************************************************");
			
			//creating two matrices    
			int a1[][]={{1,1,1},{2,2,2},{3,3,3}};    
			int b1[][]={{1,1,1},{2,2,2},{3,3,3}};    
			    
			//creating another matrix to store the multiplication of two matrices    
			int c1[][]=new int[3][3];  //3 rows and 3 columns  
			    
			//multiplying and printing multiplication of 2 matrices    
			for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c1[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			c1[i][j]+=a1[i][k]*b1[k][j];      
			}//end of k loop  
			System.out.print(c1[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
			}    
		}
	}