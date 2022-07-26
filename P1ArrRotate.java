package phase1programs_3;

class P1ArrRotate { 
public void rotate(int test[], int k) {
    		if(k > test.length) 
       			k=k%test.length;
 		int[] result = new int[test.length];
 		for(int i=0; i < k; i++){
        			result[i] = test[test.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<test.length; i++){
        			result[i] = test[j];
j++;
    		}
 		System.arraycopy( result, 0, test, 0, test.length );
}
	public static void main(String[] args) {
		P1ArrRotate r = new P1ArrRotate();
        		int arr[] = { 10, 20, 30, 40, 50, 60, 70 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
