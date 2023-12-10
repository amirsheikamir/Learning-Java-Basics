package Arrays.twoDArrays;
    import java.util.*;
    public class symmetric {
    static void checkSymetric(int[][] mat, int n, int m){
        
       int i, j, flag = 1;
       // declare new array 
       int[][] transpose = new int[n][m];
       for( i = 0; i < n; i++) {
           for( j = 0; j < m; j++) {
               transpose[j][i] = mat[i][j];
           }
       }
       
       if ( n == m ) {   // if row == col then this work 
           for(i  = 0; i < n; i++) {
               for(j  = 0; j < m; j++) {
                   if (mat[i][j] != transpose[i][j]) {
                       flag = 0;
                       break;    // if the condition not meet break
                   }
               }
           }
        }
           
           if ( flag == 0) {
               System.out.println("No");
           }else if (flag == 1) {
               System.out.println("Yes");
           }else {
               System.out.println("No");
           }
           
       
       }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
    	int[][] mat = new int[n][m];
    	
    	for (int i = 0; i < n; i++) {
    	    for(int j = 0; j < m; j++) {
    	        mat[i][j] =sc.nextInt();
    	    }
    	} 
    	
        checkSymetric(mat, n, m);
		
	}

}

