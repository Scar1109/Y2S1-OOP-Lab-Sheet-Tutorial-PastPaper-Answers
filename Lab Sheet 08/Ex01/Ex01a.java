package Ex01;

public class Ex01a {
	
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		
		int [] numbers = {2,5,3,2,6,7,3,3,6,1};
		
		System.out.println("Original array");
		for(int i = 0; i<10; i++) {
			System.out.print(numbers[i]);
		}
		
		System.out.println("\n");
		
		bubbleSort(numbers);
		
		System.out.println("Sorted array");
		for(int i = 0; i<10; i++) {
			System.out.print(numbers[i]);
		}
		
		
	}
	
	

}


