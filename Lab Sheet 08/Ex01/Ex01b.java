package Ex01;

class genBubbleSort<T extends Number> {
	
	T [] arr;
	
	public genBubbleSort(T[] arr) {
		this.arr = arr;
	}
	
    public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}

public class Ex01b {
    public static void main(String[] args) {

        Float[] numbers1 = {2.3f, 5.4f, 3.3f, 2.4f, 6.23f, 7.32f, 3.522f, 3.32f, 6.232f, 1.22f};
        Double[] numbers2 = {2.5, 5.34, 3.34, 2.34, 6.42, 7.44, 3.21, 3.32, 6.2, 1.55};

        System.out.println("Original int array");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers1[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Original double array");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers2[i] + " ");
        }

        System.out.println("\n");

        genBubbleSort<Float> obj1 = new genBubbleSort<>(numbers1);
        genBubbleSort<Double> obj2 = new genBubbleSort<>(numbers2);
        
        obj1.bubbleSort();
        obj2.bubbleSort();
        
        numbers1 = obj1.getArr();
        numbers2 = obj2.getArr();
        
        System.out.println("Sorted int array");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Sorted double array");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }
}
