public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // Return the new length of the array
    }

    public static void main(String[] args) {
     
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

    
        Solution solution = new Solution();

        int newLength = solution.removeElement(nums, val);

        System.out.println("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length of the array: " + newLength);
    }
}

    