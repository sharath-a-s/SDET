public class ArraySortAscending {

 

     public static void main(String[] args) {
            
            int arr[]= new int[] {50,2,45,90,12,1};
            
            
            System.out.println("Elements of array");
            for(int i=0; i<arr.length;i++) {
                System.out.print(arr[i]+ " ");
            }
            
            for (int i = 0; i < arr.length; i++)   
            {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
            int tmp = 0;  
            if (arr[i] > arr[j])   
            {  
            tmp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = tmp;  
            }  
            }  
            //prints the sorted element of the array  
           // System.out.println(arr[i]);  
            }  
              
            System.out.println();
            System.out.println("Sorted array in ascending order");
            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+ " ");
            }
        }

 

     

 

    }