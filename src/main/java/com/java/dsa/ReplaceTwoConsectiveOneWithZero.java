package com.java.dsa;



public class ReplaceTwoConsectiveOneWithZero {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  
        int left = 0;      
        int zeroCount = 0; 

        // Iterate through the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
           System.out.println("The Value of The right is : ="+right);
            if (nums[right] == 0) {
            	System.out.println("The Value of num of right is : =");
                zeroCount++;
            }

            
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones after replacing one zero: " + maxConsecutiveOnes);
    }
}
