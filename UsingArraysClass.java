import java.util.Arrays;
public class UsingArraysClass {
    public static void main(String[] args) {
		int[] numbers = {6,19,2,29,1,30,8,3,12,4};
		Arrays.sort(numbers);
		
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1,arr2);
		
		System.out.printf("%b%n",isEqual);
		
		//filling an array
		int[] myArrays = new int [5];
		Arrays.fill(myArrays,20);
		
		for(int component : myArrays){
			System.out.printf("%d%n",component);
		}
		//copy an Array
		int[] original = {1,2,3};
		int[] copy = Arrays.copyOf(original, 5);
		
		for(int value : copy){
			System.out.printf("%d%n",copy);
			
		}	
		int index = Arrays.binarySearch(numbers,30);
		
		System.out.printf("the index number is %d%n",index);
		
		System.out.println("===========================");
		
		for(int element : numbers){
			System.out.printf("%d%n",element);
		}
	}
}