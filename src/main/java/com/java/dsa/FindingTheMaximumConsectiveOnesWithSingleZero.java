package com.java.dsa;

public class FindingTheMaximumConsectiveOnesWithSingleZero {
	
	public static void getMaximumOfTwoNumbers(int firstNumber, int secondNumber) {
		if(firstNumber>secondNumber) {
			System.out.println("The Max of The First number us : ="+firstNumber);
		}else {
			System.out.println("The Second Number is The Maximum Number Okat : ="+secondNumber);
		}
		
	}
	
//	Method To Find The Maximum Number of COnsective Ones Okay 
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
//            Here If I Found Any Zero I will increase ZerouCounter By one Okay 
            if (nums[right] == 0) {
                zeroCount++;
            }

//             Here If zeroCount exceeds 1, move the left pointer to reduce zeroCount
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

           // Checking the Maximum Number Two Parts 
            maxCount = Math.max(maxCount, right - left + 1);
            getMaximumOfTwoNumbers(maxCount, right - left + 1);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,1,1,1,0,0};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(" Maximum consecutive ones after replacing one zero: " + maxConsecutiveOnes);
    }
}


