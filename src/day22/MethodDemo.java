package day22;

public class MethodDemo {
	
public static void printArray(int... arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String... args) {
	MethodDemo ob= new MethodDemo();
	
	ob.printArray(20,34,56);
	
	int [] arr = {20,44,26};
	ob.printArray(arr);
	ob.printArray(new int[] {40,50,60});
			}
}
