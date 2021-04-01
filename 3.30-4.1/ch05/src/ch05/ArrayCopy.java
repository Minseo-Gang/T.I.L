package ch05;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] nums = new int[4]; // [0, 0, 0, 0]
		int[] nums2 = new int[] {1, 2, 3, 4}; // [1, 2, 3, 4]
		int[] nums3 = {1, 2, 3, 4}; // [1, 2, 3, 4]
		System.out.println("------nums-------");
		
		for(int i =0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.println("\n------nums2-------");
		
		for(int i =0; i < nums2.length; i++) {
			System.out.print(nums2[i]+ " ");
		}
		System.out.println("\n------nums3-------");
		
		for(int i =0; i < nums3.length; i++) {
			System.out.print(nums3[i]+ " ");
		}
		System.out.println("\n----------------");
		int[] nums4 = nums; // 배열 복사가 아닌 같은 내용이 출력됨, 같은 데이터에 이름이 2개가 되는..
		nums4[0] = 1; // [1, 0, 0, 0]
		System.out.println(nums4[0]);
		System.out.println(nums[0]);
		System.out.println("----------------");
		System.out.println(nums4);
		System.out.println(nums);
		
		int[] nums5 = new int[4];
		int a = 1;
		int b = 2;
		a = b; // a:2, b:2
		a++; // a:3, b:2
		
		int[] nums6 = new int[4];
		for (int i = 0; i < nums6.length; i++) {
			nums6[i] = nums3[i];
		}
		for (int i = 0; i < nums6.length; i++) {
		System.out.print(nums6[i] + " ");
		}
		nums6[0] = 10;
		System.out.println(nums3[0]); // 1
		System.out.println(nums6[0]); // 10
	}

}
