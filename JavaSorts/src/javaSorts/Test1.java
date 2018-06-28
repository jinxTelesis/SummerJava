package javaSorts;

public class Test1 {

	public static void main(String[] args) {
		int array1[] = {100,98,77,90,7,101,10,50};
		
		printArray(array1);
		
		MergeSort mergeObj = new MergeSort();
		//mergeObj.sort(array1, 0, array1.length-1);
		
		//printArray(array1);
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i =0; i<n;i++)
		{
			System.out.println(arr[i] + " ");
			
		}
		System.out.println();
	}

}


