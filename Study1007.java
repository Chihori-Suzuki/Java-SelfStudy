package study;
import java.util.*;

public class Study1007 {
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sevenBoom(arr1)); // ➞ "Boom!"
		
		int[] arr2 = {8, 6, 33, 100};
		System.out.println(sevenBoom(arr2)); // ➞ "there is no 7 in the array"

		int[] arr3 = {2, 55, 60, 97, 86};
		System.out.println(sevenBoom(arr3)); // ➞ "Boom!"
	}	
	
	public static String sevenBoom(int[] arr) {
		String ans = "";
		int n = 0;
		String[] strArr = new String[arr.length];
		for(int i = 0; i < arr.length; i++){
			strArr[i] = String.valueOf(arr[i]);
			for (int j = 0; j < strArr[i].length(); j++){
				if (strArr[i].charAt(j) == '7'){
					n++;
				}
			}
		}

		if(n == 0){
			ans = "there is no 7 in the array";
		}else{
			ans = "Boom";
		}

		// if(Arrays.asList(strArr).contains("7")){
		// 	// System.out.println("Boom!");
		// 	ans = "Boom";
		// }else{
		// 	// System.out.println("there is no 7 in the array");
		// 	ans = "there is no 7 in the array";
		// }
		return ans;
	}
	


}

