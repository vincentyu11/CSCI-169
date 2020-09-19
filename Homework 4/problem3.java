package problem3;
import java.util.Scanner;

public class SortedList {
	public int size;
	public int[] array;
	
	public SortedList() {
		size = 0;
		array = new int[size];
	}
	
	public SortedList(int[] arr, int sz) {
		array = arr;
		size = sz;
		quicksort(array, 0, size-1);
	}
	public void insert(int n) {
		if (size == 0) {
			array = new int[1];
			array[0] = n;
			size = 1;
		}
		else {
			size = size + 1;
			int newarr[] = new int[size];
			for (int i = 0; i<n; i++) {
				newarr[i] = array[i];
			}
			newarr[size-1] = n;
			quicksort(array, 0, size-1);
		}
	}
	public void quicksort(int[] input, int p, int r) {
		if (p < r) {
			int j = partition(input, p ,r);
			quicksort(input, p, j-1);
			quicksort(input, j+1, r);
		}
	}
	public int partition(int[] input, int p, int r) {
		int pivot = input[r];
		while (p < r) {
			while (input[p] < pivot) {
				p++;
			}
			while (input[r] > pivot) {
				r--;
			}
			if (input[p] == input[r]) {
				p++;
			}
			else if (p < r) {
				int tmp = input[p];
				input[p] = input[r];
				input[r] = tmp;
			}
		}
		return r;
	}
	public void binarysearch(int search) {
		int first = 0;
		int last = size - 1;
		int middle = (first + last)/2;
		
		while(first <= last) {
			if (array[middle] < search)
				first = middle + 1;    
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + middle + ".");
				break;
			}
			else
				last = middle - 1;
		}
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
	}
	
	public static void main(String args[]) {
		int n, array[], search;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		array = new int[n];
		
		System.out.println("Enter " + n + " integers in any order");
		for (int i = 0; i<n; i++) {
			array[i] = in.nextInt();
		}
		
		SortedList list = new SortedList(array,n);
		
		System.out.println("Enter value to find");
		search = in.nextInt();
		list.binarysearch(search);
		in.close();
	}
	
}
