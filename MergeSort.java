import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main (String [] args){

		int [] array = new int [14];
		for(int i=0;i<array.length;i++){
			array[i] = new Random().nextInt(20);
		}
		
		System.out.println(Arrays.toString(array));
		mergeSort(array);


	}

	public static void mergeSort(int [] a){
		if (a.length > 1){

			int [] right = splitRight(a);
			int [] left = splitLeft(a);

			mergeSort(right);
			mergeSort(left);
			combine(right,left,a);

		}
	}

	public static void combine(int [] right, int [] left, int [] finished){
		int temp1 = 0;
		int temp2 = 0;

		for(int i = 0; i < finished.length;i++){
			if ((left[temp1] <= right[temp2] && left.length > temp1) || right.length <= temp2){
				finished[i] = left[temp1];
				temp1++;
			}
			else{
				finished[i] = right[temp2];
				temp2++;
			}
		}


	}
	
	public static int[] splitRight(int [] a){
		int half = a.length / 2;
		int end = a.length - half;
		int [] result = new int [end];
		for(int i=0;i<end;i++){
			result[i] = a[half+i];
		}
		return result;	
	}
	public static int[] splitLeft(int [] a){
		int half = a.length / 2;
		int [] result = new int[half];
		for(int i=0;i<half;i++){
			result[i] = a[i];
		}
		return result;
	}

}
