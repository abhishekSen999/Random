class DutchNationalFlag
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
  	void swap(int arr[],int index1,int index2)
    {
    	int temp=arr[index1];
      	arr[index1]=arr[index2];
      	arr[index2]=temp;
    }
	void partition(int arr[], int low, int high) 
	{ 
      	int mid=low;
		
		
		while(mid<=high)
        {
			//System.out.println("less= "+less+"    mid="+mid+"      more="+more);
          	switch(arr[mid])
            {
             
              case 0:
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
              case 1:mid++;
                    break;
              case 2:swap(arr,mid,high);
                    high--;
                    break;    	 
            }          	
            printArray(arr);
            
		} 
       
		
	} 


	 

	/* A utility function to print array of size n */
    static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {0,0,1,1,2,2,0,0,1,2}; 
		int n = arr.length; 

        DutchNationalFlag ob = new DutchNationalFlag(); 
        printArray(arr); 
		ob.partition(arr, 0, n-1);
		
		System.out.println("sorted array"); 
		printArray(arr); 
	} 
} 
