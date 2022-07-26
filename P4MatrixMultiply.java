package phase1programs_3;


public class P4MatrixMultiply {

	public static void main(String[] args) {

        int row1 = 3, col1 = 3, row2 = 3, col2 = 4;
 
        int A[][] = { { 1, 1, 1 },
                      { 2, 2, 2 },
                      { 3, 3, 3 }};
 
        int B[][] = { { 4, 4, 4, 4 },
                      { 5, 5, 5, 5 },
                      { 6, 6, 6, 6 }};
        
        System.out.println("\nMatrix A:");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++)
                System.out.print(A[i][j] + " ");
            System.out.println("\n"); 
            }
             System.out.println("\n");   
        
        System.out.println("\nMatrix B:");
        for ( int i = 0; i < row2; i++){ 
            for (int j = 0; j < col2; j++)
                 System.out.print(B[i][j] + " ");
                 System.out.println("\n");
        }
        
        int C[][] = new int[row1][col2];
            
             for (int i = 0; i < row1; i++) 
                for (int j = 0; j < col2; j++) 
                    for (int k = 0; k < row2; k++)
                        C[i][j] += A[i][k] * B[k][j];
             
        System.out.println("\nResultant Matrix C:");
        for (int i = 0; i < row1; i++){
           for (int j = 0; j < col2; j++)
             System.out.print(C[i][j] + " ");
             System.out.println("\n");
             }
	}
}
        
