package Arrays;

import java.util.*;
public class matrixProblem {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        int[][] ans=BooleanMatrixProblem(m,n,nums);
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] BooleanMatrixProblem(int m,int n,int[][] mat){

		for (int i =0;i < mat.length; i++) {
				boolean containsOne = false;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					containsOne = true;	
			 }
			}
			if (containsOne == true)
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = 1;
				
			}
			
		}
			return mat;
    }
}
/* 
input:
5 4
1 0 0 0
0 0 0 0
0 0 1 0
0 0 0 0
0 1 0 0

output:
1 1 1 1 
0 0 0 0 
1 1 1 1
0 0 0 0
1 1 1 1

*/