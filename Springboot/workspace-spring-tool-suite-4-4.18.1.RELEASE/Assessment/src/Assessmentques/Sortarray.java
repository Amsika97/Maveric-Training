package Assessmentques;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1,3,4,2,5};
		 int s;
		 for(int l=0; l<a.length; l++ ) {
			 System.out.println("before sorting array is :"+ a[l]);  
		 }		 
		 for(int i=0; i<a.length; i++ ) {			  
			 for(int j =i+1; j<a.length; j++ )
			 {
				 if(a[i]>a[j])
				 { 	 s = a[i];    
		             a[i] = a[j];    
		             a[j] = s;
		             }
				  }
		 }
		 System.out.println("After sorting operation performed in ascending order:");
		 for(int k =0; k<a.length;k++)
		 {
			System.out.println("Sorted array is :"+ a[k]); 
		 }
	}
}
