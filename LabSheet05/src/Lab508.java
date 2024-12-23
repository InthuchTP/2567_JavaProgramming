import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int nums[] = {25, 78, 41, 22, 36, 85,37};
		int index;
		while(true) {
		String input = (JOptionPane.showInputDialog("Input index of array"));
		index = Integer.parseInt(input);
		if(checkIndex(nums, index));{
			break;
		}else {
			
		}
	    }
}	
	
	
	
	public static boolean checkIndex(int[] nums, int index) {
		return(index<nums.length && index>=0);
	}
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}
	
	public static int prevData(int[] nums, int index) {
		return nums[index-1];
	}
	
	public static int nextData(int[] nums, int index) {
		return nums[index+1];
	}


}
