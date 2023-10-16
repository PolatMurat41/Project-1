import java.util.Scanner;


public class SortArray {
    
	
			
	
	
    public static void insertionAsc(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
    public static void insertionDesc(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && !less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
    

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    
    
	public static void Selection(Comparable []a) {        		
	int N=a.length;	
	for(int i=0;i<N-1;i++) {
		int min=i;
		                                                             
		for(int j=i+1;j<N;j++)
	
		if(less(a[j] ,a[min])) min=j;  
		
		exch(a,i,min);
		
		
		
	
	
	
	}
		
		
	}
           

	 private static void show(Comparable array[]) {
		    for(int i=0;i<array.length;i++) System.out.print(array[i]+" ");
		 
	 }

    
    
    
    
    
    
    
    public static boolean less(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0;
    }

    public static void main(String[] args) {
      
    	System.out.println("Ascending Order:");
    	Comparable[] array = { 11, 32, 99, 1, 55 };
        insertionAsc(array);
        for (Comparable i : array) {
            System.out.print(i + " ");
        }
       System.out.println("\n");
       
       
        System.out.println("Descending Order:");
    	Comparable[] array1 = { 11, 32, 99, 1, 55 };
    	insertionAsc(array1);
        for (Comparable i : array1) {
            System.out.print(i + " ");
        }
        
      
        Scanner scan=new Scanner(System.in);
        
     System.out.println("");
        System.out.println("Choose Sort Style>> [1=Selection,2=ınsertionAsc,3=ınsertionDesc]: "); 
        
        int a = scan.nextInt();
        if(a==1) {
    	  
      Selection(array);
      show(array);
      }
      else if(a== 2) {
    	  insertionAsc(array); 
    	  show(array);
      }else if(a== 3) {
    	  insertionDesc(array);
    	  show(array);
      }else
    	  System.out.println("ge�erli bir metin giriniz");
      
    
    
    
    
    
    
    }
}
