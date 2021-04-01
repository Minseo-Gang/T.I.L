package ch05;

public class bubbleArray {

	public static void main(String[] args) {
		
		int[] nums = {6, 3, 1, 7, 2}; //[0], [1], [2], [3], [4]
		
		/*
		// 6, 3 비교
		if(nums[1] < nums[0]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
			//System.out.println(nums[0]);
		} 	// 3, 6, 1, 7, 2
		
		// 3, 1 비교
		if(nums[2] < nums[0]) {
			int temp = nums[0]; 
			nums[0] = nums[2];
			nums[2] = temp;
			//System.out.println(nums[3]); 
		} //1 ,6, 3 ,7 ,2
		
		// 6, 3비교
		if(nums[2] < nums[1]) {
			int temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;
			//System.out.println(nums[2]);
		} //1, 3, 6, 7, 2

		// 6, 7 비교
		if(nums[3] < nums[2]) {
			int temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;
		}
		//System.out.println(nums[3]);
		// 1, 3, 6, 7, 2
		
		if(nums[4] < nums[3]) {
			int temp = nums[3];
			nums[3] = nums[4];
			nums[4] = temp;
		}
		*/
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		} //1, 2, 3, 6, 7
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
	} 
}
